package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovopc on 2017/1/31.
 */
@RestController
public class CacheController {

    @Autowired
    CacheManager cacheManager;

    @GetMapping("/get/{key}")
    public String get(@PathVariable String key)
    {
        Cache obj = cacheManager.getCache("empcache");

        Cache.ValueWrapper val = obj.get(key);

        return val != null ? val.get().toString() : "null";
    }

    @GetMapping("/put/{key}/{val}")
    public String put(@PathVariable String key, @PathVariable String val)
    {
        Cache obj = cacheManager.getCache("empcache");

        obj.put(key, val);

        return "ok";
    }

    @GetMapping("/get2/{key}")
    @Cacheable(value = "empcache", key = "#key")
    public String get2(@PathVariable String key)
    {
        return "ok";
    }


    @GetMapping("/remove/{key}")
    @CacheEvict(value = "empcache", key = "#key")
    public String remove(@PathVariable String key)
    {
        return "ok";
    }


}
