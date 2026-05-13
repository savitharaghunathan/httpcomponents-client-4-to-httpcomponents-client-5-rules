package com.example;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.config.SocketConfig;

import java.net.URI;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws Exception {
        // Rule: httpclient-4-to-httpclient-5-00160
        HttpClientBuilder builder1 = HttpClients.custom();
        HttpRequestRetryHandler retryHandler = null;
        builder1.setRetryHandler(retryHandler);

        // Rule: httpclient-4-to-httpclient-5-00190
        HttpClientBuilder builder2 = HttpClients.custom();
        HttpRequestInterceptor loggingInterceptor = null;
        builder2.addInterceptorLast(loggingInterceptor);

        // Rule: httpclient-4-to-httpclient-5-00200
        HttpClientBuilder builder3 = HttpClients.custom();
        SocketConfig socketConfig = SocketConfig.custom().build();
        builder3.setDefaultSocketConfig(socketConfig);

        // Rule: httpclient-4-to-httpclient-5-00220
        URI uri = new URI("http://example.com/path");
        URI normalized = URIUtils.normalizeSyntax(uri);
    }

    // Rule: httpclient-4-to-httpclient-5-00170
    public static void closeExpired(HttpClientConnectionManager connectionManager) {
        connectionManager.closeExpiredConnections();
    }

    // Rule: httpclient-4-to-httpclient-5-00180
    public static void closeIdle(HttpClientConnectionManager connectionManager) {
        connectionManager.closeIdleConnections(30, TimeUnit.SECONDS);
    }
}
