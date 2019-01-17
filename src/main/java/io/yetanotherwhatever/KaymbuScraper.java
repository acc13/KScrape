package io.yetanotherwhatever;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.lang.String.join;

/**
 * Created by achang on 1/8/2019.
 */
public class KaymbuScraper {

    /*
        Every page will contain image thumbnails tagged with an identifier in an attribute called data-id
        These can be submitted to an exporter webapp located at:
        GET http://export.kaymbu.com/download/moments?5c2e5adc4d83c1001b4810a3&5c2e5adcd22c8c001515b2f4&5c2e5add4e851b008a432a1c&5c2e5add941474008f0e4029&5c2e5ade4e851b008a432a1d&5c2e5ade97e6f3009586be8b&5c2e5adfbda7f201007b0f9f&5c2e5adff3af1d00bd2358ad&
     */


    protected List<String> scrapePicIds(String bod)
    {
        Document doc = Jsoup.parse(bod);
        return scrapePicIds(doc);
    }

    protected List<String> scrapePicIds(Document doc)
    {
        Elements els = doc.getElementsByAttributeValue("data-type", "image");

        List<String> ids = els.stream().map(e -> e.attr("data-id")).collect(Collectors.toList());

        return ids;
    }


    protected List<String> scrapeVidIds(String bod)
    {
        List<String> ids = new ArrayList();
        //video thumbnails are displayed by a .png with "still" prefix
        Pattern p = Pattern.compile("still-([a-zA-Z0-9]*).png");
        Matcher m = p.matcher(bod);

        while (m.find())
        {
            String id = m.group(1);
            ids.add(id);
        }

        return ids;
    }

    protected List<String> scrapeVidIds(Document doc)
    {
        String raw = doc.outerHtml();

        return scrapeVidIds(raw);
    }
}
