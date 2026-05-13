package com.example;

import org.apache.http.HttpHost;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.client.config.RequestConfig;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient-4-to-httpclient-5-00210
        HttpContext context = null;
        HttpHost target = (HttpHost) context.getAttribute(
            HttpCoreContext.HTTP_TARGET_HOST);

        // Rule: httpclient-4-to-httpclient-5-00230
        RequestConfig config = RequestConfig.custom()
            .setNormalizeUri(true)
            .build();
    }
}
