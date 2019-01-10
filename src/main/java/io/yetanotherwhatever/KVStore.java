package io.yetanotherwhatever;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by achang on 1/9/2019.
 */
public class KVStore {

    Map<String, String> db = new HashMap<>();

    public void save(String key, String val)
    {
        db.put(key, val);
    }

    public String get(String key)
    {
        return db.get(key);
    }

    public void delete(String key)
    {
        db.remove(key);
    }
}
