package com.example;

// Rule: httpclient4-to-httpclient5-00100
import org.apache.http.protocol.BasicHttpContext;

// Rule: httpclient4-to-httpclient5-00110
import org.apache.http.HttpEntityEnclosingRequest;

// Rule: httpclient4-to-httpclient5-00120
import org.apache.http.client.methods.HttpRequestBase;

// Rule: httpclient4-to-httpclient5-00130
import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.client.HttpRequestRetryHandler;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws Exception {
        // Rule: httpclient4-to-httpclient5-00100 (usage)
        BasicHttpContext context = new BasicHttpContext();

        // Rule: httpclient4-to-httpclient5-00140
        HttpPost httpPost = new HttpPost("https://example.com/api");

        // Rule: httpclient4-to-httpclient5-00150
        HttpClientBuilder builder = HttpClients.custom();
        builder.setRetryHandler(null);

        // Rule: httpclient4-to-httpclient5-00160
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.closeExpiredConnections();

        // Rule: httpclient4-to-httpclient5-00170
        connectionManager.closeIdleConnections(30, TimeUnit.SECONDS);
    }
}
