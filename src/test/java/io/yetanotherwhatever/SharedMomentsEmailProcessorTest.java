package io.yetanotherwhatever;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by achang on 1/10/2019.
 */
public class SharedMomentsEmailProcessorTest {

    @Test
    public void buildDownloadUrlForId_anyId_buildsKnownUrl()
    {
        String resId = "5c2cfeb872590a001b53c6d1";
        SharedMomentsEmailProcessor processor = new SharedMomentsEmailProcessor();
        String url = processor.buildDownloadUrlForId(resId);

        assertThat(url, is(equalTo("http://export.kaymbu.com/download/moments?5c2cfeb872590a001b53c6d1&")));
    }

    @Test
    public void buildDownloadLink_multiImgPage_works()
    {
        List<String> ids = new ArrayList<>();
        ids.add("5c2e5adc4d83c1001b4810a3");
        ids.add("5c2e5adcd22c8c001515b2f4");
        ids.add("5c2e5add4e851b008a432a1c");
        ids.add("5c2e5add941474008f0e4029");
        ids.add("5c2e5ade4e851b008a432a1d");
        ids.add("5c2e5ade97e6f3009586be8b");
        ids.add("5c2e5adfbda7f201007b0f9f");
        ids.add("5c2e5adff3af1d00bd2358ad");

        SharedMomentsEmailProcessor processor = new SharedMomentsEmailProcessor();
        String url = processor.buildDownloadUrlForIds(ids);

        String expected = "http://export.kaymbu.com/download/moments?5c2e5adc4d83c1001b4810a3&5c2e5adcd22c8c001515b2f4&5c2e5add4e851b008a432a1c&5c2e5add941474008f0e4029&5c2e5ade4e851b008a432a1d&5c2e5ade97e6f3009586be8b&5c2e5adfbda7f201007b0f9f&5c2e5adff3af1d00bd2358ad&";
        assertThat(url, is(equalTo(expected)));
    }

    @Test
    public void buildDestinationFileName_myLastBday_expectNameToIncludeBday()
    {
        Email email = new Email();
        Calendar c = new GregorianCalendar();
        c.set(2018, Calendar.OCTOBER, 5);
        email.setCreationDate(c);
        SharedMomentsEmailProcessor processor = new SharedMomentsEmailProcessor();
        String dest = processor.buildDestinationFileName("resourceid", ".jpg", email);

        String expected = "20181005_resourceid.jpg";

        assertThat(dest, is(equalTo(expected)));
    }
}
