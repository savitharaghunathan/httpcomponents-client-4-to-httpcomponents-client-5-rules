package com.example;

import java.net.URI;

public class Application {
    public static void main(String[] args) throws Exception {
        // Rule: httpclient4-to-httpclient5-00220
        Object targetHost = context.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);

        // Rule: httpclient4-to-httpclient5-00230
        Object connection = context.getAttribute(HttpCoreContext.HTTP_CONNECTION);

        // Rule: httpclient4-to-httpclient5-00240
        boolean normalize = config.normalizeUri;

        // Rule: httpclient4-to-httpclient5-00250
        URI normalized = URIUtils.normalizeSyntax(uri);
    }
}
