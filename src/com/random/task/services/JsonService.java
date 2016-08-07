package com.random.task.services;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by olsh on 8/5/2016.
 */
public class JsonService implements Service {
    private static final JsonService INSTANCE = new JsonService();

    private JsonService() {}

    public static JsonService getInstance(){
        return INSTANCE;
    }

    @Override
    public void initiateConnection() {
        System.out.println("HTTP connection was initiated.");
    }

    @Override
    public String buildMessage(Object message) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("HTTP with body: " + message + " was sent.");
    }

    @Override
    public void closeConnection() {
        System.out.println("HTTP connection was closed.");
    }
}
