package com.example;

// Rule: httpclient4-to-httpclient5-00270
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

// Rule: httpclient4-to-httpclient5-00280
import org.apache.http.impl.client.CloseableHttpClient;

// Rule: httpclient4-to-httpclient5-00290
import org.apache.http.impl.client.HttpClients;

// Rule: httpclient4-to-httpclient5-00300
import org.apache.http.client.ResponseHandler;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient4-to-httpclient5-00270
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();

        // Rule: httpclient4-to-httpclient5-00290
        // Rule: httpclient4-to-httpclient5-00280
        CloseableHttpClient client = HttpClients.custom()
            .setConnectionManager(cm)
            .build();

        // Rule: httpclient4-to-httpclient5-00300
        ResponseHandler<String> handler = null;
    }
}
