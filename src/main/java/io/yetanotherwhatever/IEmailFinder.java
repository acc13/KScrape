package io.yetanotherwhatever;

/**
 * Created by achang on 1/8/2019.
 */
public interface IEmailFinder {

    public void setEmailProcesser(IEmailProcesser processer);

    /* returns number of emails found and processed */
    public int findAndProcessEmails(String query);

    IEmailFinder setMaxThreadResults(long i);
}
