package com.example;

// Rule: httpclient-4-to-httpclient-5-00240
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

// Rule: httpclient-4-to-httpclient-5-00250
import org.apache.http.impl.client.CloseableHttpClient;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient-4-to-httpclient-5-00240
        PoolingHttpClientConnectionManager cm = null;

        // Rule: httpclient-4-to-httpclient-5-00250
        CloseableHttpClient client = null;
    }
}
