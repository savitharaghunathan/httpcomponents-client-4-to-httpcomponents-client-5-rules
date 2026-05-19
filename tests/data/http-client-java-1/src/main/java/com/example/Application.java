package com.example;

// Rule: httpclient4-to-httpclient5-00010
import org.apache.http.client.HttpClient;

// Rule: httpclient4-to-httpclient5-00020
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

// Rule: httpclient4-to-httpclient5-00080
import org.apache.http.entity.EntityTemplate;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.SocketConfig;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws Exception {
        // Rule: httpclient4-to-httpclient5-00030
        HttpClientBuilder builder = HttpClientBuilder.create();
        builder.setConnectionTimeToLive(1, TimeUnit.MINUTES);

        // Rule: httpclient4-to-httpclient5-00040
        RequestConfig.Builder requestConfigBuilder = RequestConfig.custom();
        requestConfigBuilder.setConnectTimeout(60000);

        // Rule: httpclient4-to-httpclient5-00050
        requestConfigBuilder.setSocketTimeout(60000);

        // Rule: httpclient4-to-httpclient5-00060
        SocketConfig.Builder socketConfigBuilder = SocketConfig.custom();
        socketConfigBuilder.setSoTimeout(60000);

        // Rule: httpclient4-to-httpclient5-00070
        HttpResponse response = null;
        response.getStatusLine();

        // Rule: httpclient4-to-httpclient5-00080 (usage)
        EntityTemplate template = new EntityTemplate(null);
    }
}
