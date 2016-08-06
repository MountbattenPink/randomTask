package com.random.task;

import com.random.task.api.Services;
import com.random.task.providers.JsonProvider;
import com.random.task.providers.SoapProvider;
import com.random.task.services.Service;

/**
 * Created by olsh on 8/4/2016.
 */
public class Main {
    public static void main(String[] args) {
        Message message =new Message.Builder()
                .from("Alex")
                .to("Anna")
                .topic("Hello")
                .text("Can we meet tomorrow?")
                .signature("Sincerely, Alex")
                .build();
        Services.registerProvider(new SoapProvider());
        Service service = Services.newInstance();
        service.initiateConnection();
        String convertedMessage = service.buildMessage(message);
        service.sendMessage(convertedMessage);
        service.closeConnection();

        Services.registerProvider(new JsonProvider());
        service = Services.newInstance();
        service.initiateConnection();
        convertedMessage = service.buildMessage(message);
        service.sendMessage(convertedMessage);
        service.closeConnection();

    }
}
