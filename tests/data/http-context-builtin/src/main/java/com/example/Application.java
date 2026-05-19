package com.example;

import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.BasicHttpContext;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient-4-to-httpclient-5-00180
        HttpContext context = new BasicHttpContext();
        HttpHost target = (HttpHost) context.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
    }
}
