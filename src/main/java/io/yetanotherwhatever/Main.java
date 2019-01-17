package io.yetanotherwhatever;

import org.apache.logging.log4j.Logger;

/**
 * Created by achang on 1/7/2019.
 */
public class Main {

    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger(Main.class);

    public static void main(String[] args)
    {
        IEmailFinder finder = new GmailFinder();

        SharedMomentsEmailProcessor processor = new SharedMomentsEmailProcessor();

        //just testing
        //no file download
        processor.setDryRunOnly(true);

        finder.setEmailProcesser(processor);
        //just testing
        //max message results
        //finder.setMaxThreadResults(1);
        finder.findAndProcessEmails("from:(@inbox.kaymbu.com) Shared Moments is:unread");

        logger.debug(processor.getEmailsSuccessfullyProcessed() + " emails successfully processed.");
        logger.debug(processor.getTotalImagesFound() + " images found.");
        logger.debug(processor.getTotalVideosFound() + " videos found.");
        logger.debug(processor.getEmailsFailedProcessing() + " emails failed.");
    }
}
