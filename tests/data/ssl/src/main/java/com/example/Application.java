package com.example;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;

public class Application {
    public void example() throws Exception {
        CloseableHttpClient client = HttpClients.custom()
            .setSSLSocketFactory(null)
            .build();
        client.close();
    }
}
