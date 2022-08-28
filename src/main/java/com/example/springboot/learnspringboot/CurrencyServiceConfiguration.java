package com.example.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component Annotation So that the prefix is managed by spring itself
@Component
@ConfigurationProperties(prefix = "currency-service")
public class CurrencyServiceConfiguration {

    //three attributes which I want to store in Currency conversion configuration
    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
