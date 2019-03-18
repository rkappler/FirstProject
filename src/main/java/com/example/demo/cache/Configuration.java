package com.example.demo.cache;

import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;

import java.util.concurrent.TimeUnit;


public class Configuration {

    private  CacheConfiguration<Integer, Integer> cacheConfiguration;

    public Configuration() {

        cacheConfiguration = CacheConfigurationBuilder
                .newCacheConfigurationBuilder(Integer.class, Integer.class,
                        ResourcePoolsBuilder.heap(100))
                .withExpiry(Expirations.timeToLiveExpiration(Duration.of(60, TimeUnit.SECONDS
                        ))).build();
    }

    public CacheConfiguration<Integer, Integer> getCacheConfiguration() {
        return cacheConfiguration;
    }
}
