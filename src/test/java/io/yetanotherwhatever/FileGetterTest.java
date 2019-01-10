package io.yetanotherwhatever;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by achang on 1/8/2019.
 */
public class FileGetterTest {

    ArrayList<String> urls = new ArrayList();

    //TODO - test these?
    private void init() {
        urls.add("http://export.kaymbu.com/download/moments?5b73170b73654d0013142816&");
        urls.add("http://export.kaymbu.com/download/moments?5b730f0653a465001ec4aecf&5b730f1653a465001ec4aed1&5b730f39f58546001841e318&5b730f43425d47001887e505&5b730f4fac525a001f2c6943&");
        urls.add("http://export.kaymbu.com/download/moments?5b730f5865a26900132b1b69&5b730fa065a26900132b1b9f&5b730fbeb6f5ec0014f4dc29&5b730fc265a26900132b1bac&");
        urls.add("http://export.kaymbu.com/download/moments?5b71c180f3a3400019488f7f&5b71c1882c5dcc0018c0cb9b&");
    }

    @Test
    public void markResourcesSaved_saveSomeResources_checkSavedFlag()
    {
        List<String> ids = new ArrayList();

        ids.add("foo");
        ids.add("bar");

        FileGetter save = new FileGetter();

        save.markResourcesUnsaved(ids);

        ids.stream().forEach(i -> {
            assertThat(save.isResourceAlreadySaved(i), is(false));
        });

        save.markResourcesSaved(ids);

        ids.stream().forEach(i -> {
            assertThat(save.isResourceAlreadySaved(i), is(true));
        });

        save.markResourcesUnsaved(ids);

        ids.stream().forEach(i -> {
            assertThat(save.isResourceAlreadySaved(i), is(false));
        });
    }

}
