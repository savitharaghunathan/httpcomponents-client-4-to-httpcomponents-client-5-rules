package com.example;

import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.HttpRequestRetryHandler;

public class Application {
    public void example() throws Exception {
        CloseableHttpClient client = HttpClients.custom()
            .setRetryHandler(null)
            .addInterceptorLast(null)
            .build();
        client.close();
    }
}
