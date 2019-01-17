package io.yetanotherwhatever;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.String.join;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;


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
    private int totalImagesFound = 0;
    private int totalVideosFound = 0;

    //emails w/ multiple photos contain a "Download All" button
    //comprised of img tag surrounded by an anchor w/ link out to Kaymbu website
    protected String findDownloadAllLink(Email email)
    {
        String body = email.getBody();
        Document doc = Jsoup.parse(body);

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

    @Override
    public boolean processEmail(Email email) {

        String href = findDownloadAllLink(email);

        int imagesAndVideosFound = 0;
        int vidsFound = 0;

        try {
            Document downloadPage = Jsoup.connect(href)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; …) Gecko/20100101 Firefox/64.0")
                    .timeout(JSOUP_TIMEOUT)
                    .get();

            imagesAndVideosFound = downloadPicsFoundInDoc(downloadPage, email);
            totalImagesFound += imagesAndVideosFound;

            vidsFound = downloadVideosFoundInDoc(downloadPage, email);
            totalVideosFound += vidsFound;

            imagesAndVideosFound += vidsFound;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        if(imagesAndVideosFound <= 0)
        {
            logger.error("No images or videos found in email id: " + email.getId() + ", download all link: " + href);
            failedEmails++;
        }
        else
        {
            successEmails++;
        }

        return imagesAndVideosFound > 0;
    }

    private int downloadVideosFoundInDoc(Document doc, Email email)
    {
        KaymbuScraper scraper = new KaymbuScraper();
        List<String> ids = scraper.scrapeVidIds(doc);

        downloadResources(ids, VID_EXT, email);

        return ids.size();
    }

    private void downloadResources(List<String> ids, String extension, Email email) {
        FileGetter saver = new FileGetter();
        ids.stream().forEach(id -> {

            String destFileName = buildDestinationFileName(id, extension, email);

            if (!dryRunOnly)
            {
                saver.saveResource(buildDownloadUrlForId(id), destFileName, id);
            }

            logger.debug("File saved: " + DEST_DIR + "\\" + destFileName);
        });
    }

    protected String buildDestinationFileName(String resourceId, String extension, Email email)
    {
        Calendar c = email.getCreationDate();
        Date date = c.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
        String ts = format1.format(date);

        return ts + "_" + resourceId + extension;
    }

    private final int JSOUP_TIMEOUT = 5000;
    private int downloadPicsFoundInDoc(Document doc, Email email)
    {
        List<String> ids = null;

        KaymbuScraper scraper = new KaymbuScraper();
        ids = scraper.scrapePicIds(doc);

        if (null == ids)
        {
            return 0;
        }

        downloadResources(ids, IMG_EXT, email);

        return ids.size();
    }

    @Override
    public IEmailProcesser setDryRunOnly(boolean b) {

        this.dryRunOnly = b;

        return this;
    }

    private static final String DOWNLOAD_URL = "http://export.kaymbu.com/download/moments?";
    private static final String ARG_DELIM = "&";

    public String buildDownloadUrlForIds(List<String> ids)
    {
        return DOWNLOAD_URL + join(ARG_DELIM, ids)
                + ARG_DELIM;    //their dumb website always adds a trailing one
    }

    public String buildDownloadUrlForId(String id)
    {
        List<String> idInList = new ArrayList<>();
        idInList.add(id);
        return buildDownloadUrlForIds(idInList);
    }

    public int getEmailsSuccessfullyProcessed()
    {
        return this.successEmails;
    }

    public int getEmailsFailedProcessing()
    {
        return this.failedEmails;
    }

    public int getTotalImagesFound()
    {
        return this.totalImagesFound;
    }

    public int getTotalVideosFound()
    {
        return this.totalVideosFound;
    }

}
