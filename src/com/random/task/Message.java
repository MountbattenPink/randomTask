package com.random.task;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by olsh on 8/5/2016.
 */
public class Message {
    private final BigInteger id;
    private final String from;
    private final String to;
    private final Calendar sent;
    private final Calendar recieved;
    private final String topic;
    private final String text;
    private final String signature;

    public static class Builder {
        private final BigInteger id;
        private String from;
        private String to;
        private Calendar sent;
        private Calendar recieved;
        private String topic;
        private String text;
        private String signature;

        public Builder(){
            this.id = BigInteger.probablePrime(10, new Random(1_000_000_000));
            this.from = "";
            this.to = "";
            this.sent = Calendar.getInstance();
            this.topic = "";
            this.text = "";
            this.signature = "";
            this.recieved = Calendar.getInstance();
        }

        public Builder from(String from){
            this.from = from;
            return this;
        }

        public Builder to(String to){
            this.to = to;
            return this;
        }
        public Builder sent(Calendar sent){
            this.sent = sent;
            return this;
        }
        public Builder recieved(Calendar recieved){
            this.recieved = recieved;
            return this;
        }
        public Builder topic(String topic){
            this.topic = topic;
            return this;
        }
        public Builder text(String text){
            this.text = text;
            return this;
        }
        public Builder signature(String signature){
            this.signature = signature;
            return this;
        }
        public Message build(){
            return new Message(this);
        }

    }

        private Message (Builder builder){
            this.from = builder.from;
            this.id = builder.id;
            this.recieved = builder.recieved;
            this.sent = builder.sent;
            this.signature = builder.signature;
            this.text = builder.text;
            this.topic = builder.topic;
            this.to = builder.to;
        }

    }
