package com.example;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00030
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00040
import org.apache.http.ssl.SSLContexts;

public class Application {
    public static void main(String[] args) {
        // Rule: httpcomponents-client-4-to-httpcomponents-client-5-00030
        SSLConnectionSocketFactory factory = null;

        // Rule: httpcomponents-client-4-to-httpcomponents-client-5-00040
        SSLContexts contexts = null;
    }
}
