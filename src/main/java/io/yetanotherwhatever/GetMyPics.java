package io.yetanotherwhatever;

import org.apache.logging.log4j.Logger;

/**
 * Created by achang on 1/7/2019.
 */
public class GetMyPics {

    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(GetMyPics.class);

    public static void main(String[] args)
    {
        IEmailFinder finder = new GmailFinder();

        SharedMomentsEmailProcessor processor = new SharedMomentsEmailProcessor();

        //just testing
        //processor.setDryRunOnly(false);

        finder.setEmailProcesser(processor);
        //just testing
        //finder.setMaxThreadResults(1);
        finder.findAndProcessEmails("from:(@inbox.kaymbu.com) Shared Moments");

        logger.debug(processor.getEmailsSuccessfullyProcessed() + " emails successfully processed.");
        logger.debug(processor.getImagesFound() + " images found.");
        logger.debug(processor.getVideosFound() + " videos found.");
        logger.debug(processor.getEmailsFailedProcessing() + " emails failed.");
    }
}
