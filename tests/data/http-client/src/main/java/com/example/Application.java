package com.example;

// Rule: httpclient-4-to-httpclient-5-00020
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

// Rule: httpclient-4-to-httpclient-5-00040
import org.apache.http.client.methods.HttpPost;

// Rule: httpclient-4-to-httpclient-5-00050
import org.apache.http.entity.EntityTemplate;

// Rule: httpclient-4-to-httpclient-5-00250
import org.apache.http.impl.client.CloseableHttpClient;

// Rule: httpclient-4-to-httpclient-5-00010
import org.apache.http.HttpResponse;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws Exception {
        // Rule: httpclient-4-to-httpclient-5-00030
        HttpClientBuilder clientBuilder = HttpClients.custom();
        clientBuilder.setConnectionTimeToLive(1, TimeUnit.MINUTES);
        CloseableHttpClient client = clientBuilder.build();

        // Rule: httpclient-4-to-httpclient-5-00060
        HttpPost post = new HttpPost("http://example.com");
        HttpResponse response = client.execute(post);
        response.getStatusLine();

        // Rule: httpclient-4-to-httpclient-5-00170
        HttpClientBuilder retryBuilder = HttpClients.custom();
        retryBuilder.setRetryHandler(null);
    }
}
