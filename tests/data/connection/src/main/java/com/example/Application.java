package com.example;

// Rule: httpclient-4-to-httpclient-5-00240
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient-4-to-httpclient-5-00070
        RequestConfig.Builder requestConfigBuilder = RequestConfig.custom();
        requestConfigBuilder.setConnectTimeout(60000);

        // Rule: httpclient-4-to-httpclient-5-00080
        requestConfigBuilder.setSocketTimeout(60000);

        // Rule: httpclient-4-to-httpclient-5-00090
        SocketConfig.Builder socketConfigBuilder = SocketConfig.custom();
        socketConfigBuilder.setSoTimeout(60000);

        // Rule: httpclient-4-to-httpclient-5-00140
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        cm.closeExpiredConnections();

        // Rule: httpclient-4-to-httpclient-5-00150
        cm.closeIdleConnections(30, TimeUnit.SECONDS);

        // Rule: httpclient-4-to-httpclient-5-00260
        HttpClientBuilder builder = HttpClients.custom();
        builder.setDefaultSocketConfig(socketConfigBuilder.build());
    }
}
