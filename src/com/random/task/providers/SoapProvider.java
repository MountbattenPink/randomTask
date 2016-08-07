package com.random.task.providers;

import com.random.task.services.SoapService;
import com.random.task.services.Service;

/**
 * Created by olsh on 8/5/2016.
 */
public class SoapProvider implements Provider {
    @Override
    public Service newService() {
        return SoapService.getInstance();
    }
}
