package com.example;

import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;

import javax.net.ssl.SSLSession;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient4-to-httpclient5-00160
        HttpCoreContext context = new HttpCoreContext();
        HttpHost target = (HttpHost) context.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);

        // Rule: httpclient4-to-httpclient5-00170
        ManagedHttpClientConnection conn = (ManagedHttpClientConnection)
            context.getAttribute(HttpCoreContext.HTTP_CONNECTION);
        SSLSession session = conn.getSSLSession();

        // Rule: httpclient4-to-httpclient5-00190
        RequestConfig config = RequestConfig.custom()
            .setNormalizeUri(true)
            .build();

        // Rule: httpclient4-to-httpclient5-00200
        RequestConfig config2 = RequestConfig.custom().setConnectTimeout(60000).setSocketTimeout(60000).build();
    }
}
