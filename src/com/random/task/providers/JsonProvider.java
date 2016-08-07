package com.random.task.providers;

import com.random.task.services.JsonService;
import com.random.task.services.Service;

/**
 * Created by olsh on 8/5/2016.
 */
public class JsonProvider implements Provider {
    @Override
    public Service newService() {
        return JsonService.getInstance();
    }
}
