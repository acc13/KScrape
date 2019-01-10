package io.yetanotherwhatever;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;


/**
 * Created by achang on 1/7/2019.
 */
public class SharedMomentsEmailProcessor implements IEmailProcesser {

    private static final String DEST_DIR= System.getProperty("user.dir");
    private static final String IMG_EXT= ".jpg";
    private static final String VID_EXT= ".mp4";

    private static final Logger logger = LogManager.getLogger(SharedMomentsEmailProcessor.class);
    private boolean dryRunOnly = false;
    private int successEmails = 0;
    private int failedEmails = 0;
    private int imagesFound = 0;
    private int videosFound = 0;

    //emails w/ multiple photos contain a "Download All" button
    //comprised of img tag surrounded by an anchor w/ link out to Kaymbu website
    protected String findDownloadAllLink(Email email)
    {
        String body = email.getBody();
        Document doc = buildDoc(body);

        Elements els = doc.getElementsByAttributeValue("alt", "Download All");

        Optional<Element> img = els.stream().findFirst();

        Optional<String> href = img.map(i -> i.parent()).map(a -> a.attr("href"));

        if (!href.isPresent())
        {
            return (findSingleDownloadLink(doc));
        }

        return href.orElse(null);
    }

    //
    private String findSingleDownloadLink(Document doc)
    {
        Elements els = doc.getElementsByAttributeValue("class", "moment-image");

        if (els.size() == 0)
        {
            logger.error("Single image link not found!");
            return null;
        }

        if (els.size() == 0)
        {
            logger.warn("Whaaaa? More than one image link found??");
            return null;
        }

        Optional<Element> img = els.stream().findFirst();

        Optional<String> href = img.map(i -> i.parent()).map(a -> a.attr("href"));

        return href.orElse(null);
    }

    private static Document buildDoc(String body)
    {
        Document doc = Jsoup.parse(body);

        if (doc == null)
        {
            logger.error("Unable to parse document");
        }

        return doc;
    }

    protected static String base64UrlDecode(String body)
    {
        byte[] bytes = Base64.getUrlDecoder().decode(body.getBytes());

        String decoded = new String(bytes);

        return decoded;
    }

    @Override
    public boolean processEmail(Email email) {

        String href = findDownloadAllLink(email);

        int found = 0;
        int vidsFound = 0;

        try {
            Document doc = Jsoup.connect(href)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; …) Gecko/20100101 Firefox/64.0")
                    .timeout(JSOUP_TIMEOUT)
                    .get();

            found = getPics(doc);
            vidsFound = getVids(doc);
            found += vidsFound;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        if(found <= 0)
        {
            logger.error("No images or videos found in email id: " + email.getId() + ", download all link: " + href);
            failedEmails++;
        }
        else
        {
            successEmails++;
        }

        return found > 0;
    }

    private int getVids(Document doc)
    {
        KaymbuScraper scraper = new KaymbuScraper();
        List<String> ids = scraper.scrapeVidIds(doc);

        videosFound += ids.size();

        buildDownloadUrlForEach(scraper, ids, VID_EXT);

        return ids.size();
    }

    private void buildDownloadUrlForEach(KaymbuScraper scraper, List<String> ids, String extension) {
        FileGetter saver = new FileGetter();
        ids.stream().forEach(id -> {

            String destFileName = id + extension;

            if (!dryRunOnly)
            {
                saver.saveResource(scraper.buildDownloadUrlFor(id), destFileName, id);
            }

            logger.debug("File saved: " + DEST_DIR + "\\" + destFileName);
        });
    }

    private final int JSOUP_TIMEOUT = 5000;
    private int getPics(Document doc)
    {
        List<String> ids = null;

        KaymbuScraper scraper = new KaymbuScraper();
        ids = scraper.scrapePicIds(doc);

        if (null == ids)
        {
            return 0;
        }

        imagesFound += ids.size();

        buildDownloadUrlForEach(scraper, ids, IMG_EXT);

        return ids.size();
    }

    @Override
    public IEmailProcesser setDryRunOnly(boolean b) {

        this.dryRunOnly = b;

        return this;
    }

    public int getEmailsSuccessfullyProcessed()
    {
        return this.successEmails;
    }

    public int getEmailsFailedProcessing()
    {
        return this.failedEmails;
    }

    public int getImagesFound()
    {
        return this.imagesFound;
    }

    public int getVideosFound()
    {
        return this.videosFound;
    }
}
