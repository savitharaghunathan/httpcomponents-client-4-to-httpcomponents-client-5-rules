package com.example;

// Rule: httpclient4-to-httpclient5-00010
// (PACKAGE rule detects any org.apache.http import - triggered by all imports below)

// Rule: httpclient4-to-httpclient5-00020
import org.apache.http.protocol.BasicHttpContext;

// Rule: httpclient4-to-httpclient5-00030
import org.apache.http.HttpEntityEnclosingRequest;

// Rule: httpclient4-to-httpclient5-00040
import org.apache.http.client.methods.HttpRequestBase;

// Rule: httpclient4-to-httpclient5-00050
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

// Rule: httpclient4-to-httpclient5-00060
import org.apache.http.conn.ManagedHttpClientConnection;

// Rule: httpclient4-to-httpclient5-00070
import org.apache.http.HttpResponse;

// Rule: httpclient4-to-httpclient5-00080
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient4-to-httpclient5-00020
        BasicHttpContext context = new BasicHttpContext();

        // Rule: httpclient4-to-httpclient5-00040
        HttpRequestBase requestBase = null;

        // Rule: httpclient4-to-httpclient5-00050
        SSLConnectionSocketFactory sslFactory = null;

        // Rule: httpclient4-to-httpclient5-00060
        ManagedHttpClientConnection connection = null;

        // Rule: httpclient4-to-httpclient5-00070
        HttpResponse response = null;

        // Rule: httpclient4-to-httpclient5-00080
        HttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager();
        connManager.closeExpiredConnections();
    }
}
