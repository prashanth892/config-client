package com.fedex.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
@RefreshScope
@ConfigurationProperties(prefix = "subscriber.jms")
@EnableConfigurationProperties(JmsModel.class)
public class JmsModel implements Serializable {

    private String jms;

    private config config =new config();

    public String getJms() {
        return jms;
    }

    public void setJms(String jms) {
        this.jms = jms;
    }

    public config getConfig() {
        return config;
    }

    public void setConig(config config) {
        this.config = config;
    }



}
