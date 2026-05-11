package com.example;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00200
import org.apache.http.client.CookieStore;

import org.apache.http.impl.client.BasicCookieStore;

public class Application {
    public static void main(String[] args) {
        CookieStore store = new BasicCookieStore();
    }
}
