package com.random.task.providers;

import com.random.task.services.Service;

/**
 * Service provider interface.
 * Created by olsh on 8/4/2016.
 */
public interface Provider {
    Service newService();
}
