package com.example;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00050
import org.apache.http.client.config.RequestConfig;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00060
import org.apache.http.config.SocketConfig;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00070
import org.apache.http.client.config.CookieSpecs;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00190
import org.apache.http.impl.client.HttpClientBuilder;

public class Application {
    public static void main(String[] args) {
        RequestConfig requestConfig = RequestConfig.custom().build();
        SocketConfig socketConfig = SocketConfig.custom().build();
        String cookieSpec = CookieSpecs.STANDARD_STRICT;
        HttpClientBuilder builder = HttpClientBuilder.create();
    }
}
