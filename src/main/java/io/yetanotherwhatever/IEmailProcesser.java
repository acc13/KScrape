package io.yetanotherwhatever;

/**
 * Created by achang on 1/8/2019.
 */
public interface IEmailProcesser {

    public boolean processEmail(Email e);

    IEmailProcesser setDryRunOnly(boolean b);
}
