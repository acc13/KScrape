package io.yetanotherwhatever;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by achang on 1/8/2019.
 */
public class KaymbuScraperTest {


    @Test
    public void scrapePicIds_MultiImgPage_findsAllIds()
    {
        KaymbuScraper scraper = new KaymbuScraper();

        List<String> ids = scraper.scrapePicIds(TestKaymbuDownloadPages.MULTI_IMG_PAGE);

        assertThat( ids, hasItems("5c2e5adc4d83c1001b4810a3"));
    }

    @Test
    public void scrapePicIds_SingleImgPage_findsAllIds()
    {
        KaymbuScraper scraper = new KaymbuScraper();

        List<String> ids = scraper.scrapePicIds(TestKaymbuDownloadPages.SINGLE_IMG_PAGE);

        assertThat( ids, hasItems("5c2cfeb872590a001b53c6d1"));
    }

    @Test
    public void scrapeVidIds_vidPage_succeeds()
    {
       String expectedId = "5bad73f82719b9001abc0d6a";


        KaymbuScraper scraper = new KaymbuScraper();
        List<String> ids = scraper.scrapeVidIds(TestKaymbuDownloadPages.SINGLE_VIDEO_PAGE);

        assertThat(ids, hasItem(expectedId));
    }

    @Test
    public void scrapeVidIds_mixedVidsAndImages_succeeds()
    {
        String expectedId = "5afc83a271d09100149051ae";


        KaymbuScraper scraper = new KaymbuScraper();
        List<String> ids = scraper.scrapeVidIds(TestKaymbuDownloadPages.MIXED_VIDEOS_AND_IMAGES_PAGE);

        assertThat(ids.size(), is(equalTo(3)));
        assertThat(ids, hasItems("5afc83a271d09100149051ae", "5afc83a370ec5d0013c599d1", "5afc83a474d2e70013843ef2"));
    }

    @Test
    public void scrapeVidIds_multipleVids_succeeds()
    {
        KaymbuScraper scraper = new KaymbuScraper();
        List<String> ids = scraper.scrapeVidIds(TestKaymbuDownloadPages.MULTI_VIDEO_PAGE);

        assertThat(ids.size(), is(equalTo(2)));
        assertThat(ids, hasItems("5c1a8ad8d162d1001560135b", "5c1a8b27d38a230014bade75"));
    }



}
