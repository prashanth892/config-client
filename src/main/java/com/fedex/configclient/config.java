package com.fedex.configclient;

import org.springframework.beans.factory.annotation.Value;

public class config {

    public String JMS_INITIAL_CONTEXT;
    public String JMS_USERNAME;
    public String JMS_PASSWORD;
    public String JMS_CONNECTION_FACTORY;
    public String JMS_DESTINATION;
    public String JMS_DESTINATION_TYPE;
    public String NUM_CONCURRENT_CONSUMERS;
    public String MESSAGE_PROCESSOR;
    public String JMS_URL;

    public String getJMS_URL() {
        return JMS_URL;
    }

    public void setJMS_URL(String JMS_URL) {
        this.JMS_URL = JMS_URL;
    }

    public String getJMS_INITIAL_CONTEXT() {
        return JMS_INITIAL_CONTEXT;
    }

    public void setJMS_INITIAL_CONTEXT(String JMS_INITIAL_CONTEXT) {
        this.JMS_INITIAL_CONTEXT = JMS_INITIAL_CONTEXT;
    }

    public String getJMS_USERNAME() {
        return JMS_USERNAME;
    }

    public void setJMS_USERNAME(String JMS_USERNAME) {
        this.JMS_USERNAME = JMS_USERNAME;
    }

    public String getJMS_PASSWORD() {
        return JMS_PASSWORD;
    }

    public void setJMS_PASSWORD(String JMS_PASSWORD) {
        this.JMS_PASSWORD = JMS_PASSWORD;
    }

    public String getJMS_CONNECTION_FACTORY() {
        return JMS_CONNECTION_FACTORY;
    }

    public void setJMS_CONNECTION_FACTORY(String JMS_CONNECTION_FACTORY) {
        this.JMS_CONNECTION_FACTORY = JMS_CONNECTION_FACTORY;
    }

    public String getJMS_DESTINATION() {
        return JMS_DESTINATION;
    }

    public void setJMS_DESTINATION(String JMS_DESTINATION) {
        this.JMS_DESTINATION = JMS_DESTINATION;
    }

    public String getJMS_DESTINATION_TYPE() {
        return JMS_DESTINATION_TYPE;
    }

    public void setJMS_DESTINATION_TYPE(String JMS_DESTINATION_TYPE) {
        this.JMS_DESTINATION_TYPE = JMS_DESTINATION_TYPE;
    }

    public String getNUM_CONCURRENT_CONSUMERS() {
        return NUM_CONCURRENT_CONSUMERS;
    }

    public void setNUM_CONCURRENT_CONSUMERS(String NUM_CONCURRENT_CONSUMERS) {
        this.NUM_CONCURRENT_CONSUMERS = NUM_CONCURRENT_CONSUMERS;
    }

    public String getMESSAGE_PROCESSOR() {
        return MESSAGE_PROCESSOR;
    }

    public void setMESSAGE_PROCESSOR(String MESSAGE_PROCESSOR) {
        this.MESSAGE_PROCESSOR = MESSAGE_PROCESSOR;
    }

    @Override
    public String toString() {
        return "config{" +
                "JMS_INITIAL_CONTEXT='" + JMS_INITIAL_CONTEXT + '\'' +
                ", JMS_USERNAME='" + JMS_USERNAME + '\'' +
                ", JMS_PASSWORD='" + JMS_PASSWORD + '\'' +
                ", JMS_CONNECTION_FACTORY='" + JMS_CONNECTION_FACTORY + '\'' +
                ", JMS_DESTINATION='" + JMS_DESTINATION + '\'' +
                ", JMS_DESTINATION_TYPE='" + JMS_DESTINATION_TYPE + '\'' +
                ", NUM_CONCURRENT_CONSUMERS='" + NUM_CONCURRENT_CONSUMERS + '\'' +
                ", MESSAGE_PROCESSOR='" + MESSAGE_PROCESSOR + '\'' +
                ", JMS_URL='" + JMS_URL + '\'' +
                '}';
    }
}
