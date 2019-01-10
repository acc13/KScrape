package io.yetanotherwhatever;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Created by achang on 1/8/2019.
 */
public class FileGetter {

    private static final Logger logger = LogManager.getLogger(FileGetter.class);

    KVStore store = new KVStore();


    private static final int CONNECT_TIMEOUT = 15000;
    private static final int READ_TIMEOUT = 15000;



    public boolean saveResource(String url, String destFileName, String resourceId)
    {
        if (isResourceAlreadySaved(resourceId))
        {
            logger.error("Collision detected for image: " + resourceId);
            return false;
        }

        try {

            FileUtils.copyURLToFile(
                    new URL(url),
                    new File(destFileName),
                    CONNECT_TIMEOUT,
                    READ_TIMEOUT);

            markResourceSaved(destFileName);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    protected boolean isResourceAlreadySaved(String id)
    {
        return store.get(id) != null;
    }

    protected void markResourcesSaved(List<String> ids)
    {
        ids.stream().forEach(i -> {
            markResourceSaved(i);
        });
    }

    protected void markResourceSaved(String id)
    {
        store.save(id, "true");
    }

    protected void markResourcesUnsaved(List<String> ids)
    {
        ids.stream().forEach(i -> {
            store.delete(i);
        });
    }

}
