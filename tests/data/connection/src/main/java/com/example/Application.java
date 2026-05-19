package com.example;

import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient4-to-httpclient5-00260
        SocketConfig socketConfig = SocketConfig.custom()
            .setSoTimeout(60000)
            .build();
        CloseableHttpClient client = HttpClients.custom()
            .setDefaultSocketConfig(socketConfig)
            .build();
    }
}
