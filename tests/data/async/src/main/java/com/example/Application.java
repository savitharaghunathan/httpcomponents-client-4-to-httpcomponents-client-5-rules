package com.example;

// Rule: httpclient4-to-httpclient5-00210
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

// Rule: httpclient4-to-httpclient5-00220
import org.apache.http.impl.client.CloseableHttpClient;

// Rule: httpclient4-to-httpclient5-00230
import org.apache.http.impl.client.HttpClients;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient4-to-httpclient5-00210
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();

        // Rule: httpclient4-to-httpclient5-00220
        // Rule: httpclient4-to-httpclient5-00230
        CloseableHttpClient client = HttpClients.custom()
            .setConnectionManager(cm)
            .build();
    }
}
