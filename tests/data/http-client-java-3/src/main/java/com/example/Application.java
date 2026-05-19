package com.example;

import org.apache.http.impl.client.HttpClientBuilder;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient4-to-httpclient5-00240
        HttpClientBuilder builder = HttpClientBuilder.create();
        builder.setConnectionTimeToLive(1, TimeUnit.MINUTES);
    }
}
