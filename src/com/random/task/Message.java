package com.random.task;

/**
 * Created by olsh on 8/5/2016.
 */
public class Message {
    private String from;
    private String to;
    private String topic;
    private String text;

    public Message(String from, String to, String topic, String text) {
        this.from = from;
        this.to = to;
        this.topic = topic;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
