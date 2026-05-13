package com.example;

// Rule: httpclient-4-to-httpclient-5-00030
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.config.RequestConfig;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws Exception {
        // Rule: httpclient-4-to-httpclient-5-00020
        // Package reference to org.apache.http is satisfied by imports above

        // Rule: httpclient-4-to-httpclient-5-00040
        HttpResponse response = null;
        response.getStatusLine();

        // Rule: httpclient-4-to-httpclient-5-00050
        HttpClientBuilder builder = HttpClients.custom();
        builder.setConnectionTimeToLive(1, TimeUnit.MINUTES);

        // Rule: httpclient-4-to-httpclient-5-00060
        RequestConfig.Builder configBuilder = RequestConfig.custom();
        configBuilder.setConnectTimeout(60000);

        // Rule: httpclient-4-to-httpclient-5-00070
        configBuilder.setSocketTimeout(60000);
    }
}
