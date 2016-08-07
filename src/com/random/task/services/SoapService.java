package com.random.task.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Concrete service that helps to communicate via soap
 * Created by olsh on 8/4/2016.
 */
public class SoapService implements Service {

    private static final SoapService INSTANCE = new SoapService();

    private SoapService() {}

    public static SoapService getInstance(){
        return INSTANCE;
    }

    @Override
    public void initiateConnection() {
        System.out.println("SOAP connection was initiated.");
    }

    @Override
    public String buildMessage(Object message) {
        String xml=null;
        try {
            XmlMapper mapper = new XmlMapper();
            xml = mapper.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return xml;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("SOAP with body: " + message + " was sent.");
    }

    @Override
    public void closeConnection() {
        System.out.println("SOAP connection was closed.");
    }
}
