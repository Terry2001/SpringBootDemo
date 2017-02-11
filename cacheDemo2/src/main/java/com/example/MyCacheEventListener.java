package com.example;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListener;

/**
 * Created by lenovopc on 2017/1/31.
 */
public class MyCacheEventListener implements CacheEventListener {
    @Override
    public void notifyElementRemoved(Ehcache cache, Element element) throws CacheException {
        System.out.println(element.getObjectKey());
    }

    @Override
    public void notifyElementPut(Ehcache cache, Element element) throws CacheException {

    }

    @Override
    public void notifyElementUpdated(Ehcache cache, Element element) throws CacheException {

    }

    @Override
    public void notifyElementExpired(Ehcache cache, Element element) {

    }

    @Override
    public void notifyElementEvicted(Ehcache cache, Element element) {

    }

    @Override
    public void notifyRemoveAll(Ehcache cache) {

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public void dispose() {

    }
}
