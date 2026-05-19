package com.example;

import org.apache.http.client.config.RequestConfig;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient-4-to-httpclient-5-00120
        RequestConfig config = RequestConfig.custom()
            .setNormalizeUri(true)
            .build();
        boolean normalizeUri = config.isNormalizeUri();
    }
}
