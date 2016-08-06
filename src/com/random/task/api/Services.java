package com.random.task.api;

import com.random.task.providers.Provider;
import com.random.task.services.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This is service access API class
 * Services is noninstantiable class.
 *
 * Created by olsh on 8/4/2016.
 */
public class Services {
    private Services(){};
    private static final Map<String,Provider> providers=new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME = "soap";


    /**
     * Service access API.
     * Here clients can choose provider criteria to get service instance.
     */
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    private static Service newInstance(String providerName) {
        Provider currentProvider = providers.get(providerName);
        if (currentProvider==null){
            throw new IllegalArgumentException("Provider not found");
        }
        return currentProvider.newService();
    }


    /**
     * Provider registration API.
     * This is used for registering implementations of provider.
     * These implementations give access to service for clients
     */
    public static void registerProvider(Provider provider){
        registerProvider(DEFAULT_PROVIDER_NAME,provider);
    }

    private static void registerProvider(String providerName, Provider provider) {
        providers.put(providerName, provider);
    }
}
