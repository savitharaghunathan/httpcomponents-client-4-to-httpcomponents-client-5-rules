package com.example;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import javax.net.ssl.SSLContext;

public class Application {
    public static void main(String[] args) throws Exception {
        HttpClientBuilder builder = HttpClientBuilder.create();

        // Rule: httpclient4-to-httpclient5-00180
        HttpRequestInterceptor interceptor = null;
        builder.addInterceptorLast(interceptor);

        // Rule: httpclient4-to-httpclient5-00190
        HttpRequest request = null;
        request.getRequestLine();

        // Rule: httpclient4-to-httpclient5-00200
        HttpResponse response = null;
        response.getAllHeaders();

        // Rule: httpclient4-to-httpclient5-00210
        SSLConnectionSocketFactory sslFactory = null;
        builder.setSSLSocketFactory(sslFactory);
    }
}
