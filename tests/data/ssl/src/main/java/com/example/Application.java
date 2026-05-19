package com.example;

// Rule: httpclient-4-to-httpclient-5-00190
import org.apache.http.conn.ManagedHttpClientConnection;

import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

public class Application {
    public static void main(String[] args) {
        SSLConnectionSocketFactory sslFactory = null;
        HttpClientBuilder builder = HttpClients.custom();

        // Rule: httpclient-4-to-httpclient-5-00100
        builder.setSSLSocketFactory(sslFactory);

        // Rule: httpclient-4-to-httpclient-5-00190
        ManagedHttpClientConnection conn = null;
    }
}
