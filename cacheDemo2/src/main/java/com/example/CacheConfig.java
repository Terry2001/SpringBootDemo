package com.example;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by lenovopc on 2017/1/31.
 */
@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public CacheManager getEhCacheManager(){
        CacheManager manager = new EhCacheCacheManager(getEhCacheFactory().getObject());


        //注册缓存变动监听事件，此机制可用于实现缓存依赖，达到移除一个缓存项同时移除其他相关缓存的作用
        net.sf.ehcache.Cache cc = (net.sf.ehcache.Cache)manager.getCache("empcache").getNativeCache();
        cc.getCacheEventNotificationService().registerListener(new MyCacheEventListener());

        return manager;
    }

    @Bean
    public EhCacheManagerFactoryBean getEhCacheFactory(){

        EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
        factoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        factoryBean.setShared(true);



        return factoryBean;
    }


}
