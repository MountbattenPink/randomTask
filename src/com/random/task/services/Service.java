package com.random.task.services;

/**
 * Service interface.
 * Created by olsh on 8/4/2016.
 */
public interface Service {
    void initiateConnection();
    String buildMessage(Object message);
    void sendMessage(String message);
    void closeConnection();
}
