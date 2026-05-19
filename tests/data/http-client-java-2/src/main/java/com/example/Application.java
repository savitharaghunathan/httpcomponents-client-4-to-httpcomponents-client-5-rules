package com.example;

import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.config.SocketConfig;
import org.apache.http.client.HttpRequestRetryHandler;

import java.net.URI;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws Exception {
        // Rule: httpclient4-to-httpclient5-00090
        HttpClientConnectionManager connManager = null;
        connManager.closeIdleConnections(30, TimeUnit.SECONDS);

        // Rule: httpclient4-to-httpclient5-00100
        HttpClientBuilder builder = HttpClientBuilder.create();
        HttpRequestInterceptor interceptor = null;
        builder.addInterceptorLast(interceptor);

        // Rule: httpclient4-to-httpclient5-00110
        HttpClientBuilder builder2 = HttpClientBuilder.create();
        SocketConfig socketConfig = SocketConfig.custom().build();
        builder2.setDefaultSocketConfig(socketConfig);

        // Rule: httpclient4-to-httpclient5-00120
        HttpClientBuilder builder3 = HttpClientBuilder.create();
        HttpRequestRetryHandler retryHandler = null;
        builder3.setRetryHandler(retryHandler);

        // Rule: httpclient4-to-httpclient5-00130
        HttpMessage message = null;
        message.getAllHeaders();

        // Rule: httpclient4-to-httpclient5-00140
        HttpRequest request = null;
        request.getRequestLine();

        // Rule: httpclient4-to-httpclient5-00150
        HttpResponse response = null;
        response.getStatusLine();

        // Rule: httpclient4-to-httpclient5-00180
        URI uri = new URI("http://example.com");
        URIUtils.normalizeSyntax(uri);
    }
}
