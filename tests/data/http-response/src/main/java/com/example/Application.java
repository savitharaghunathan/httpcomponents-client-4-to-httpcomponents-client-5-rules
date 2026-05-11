package com.example;

import org.apache.http.HttpResponse;

public class Application {
    public static void main(String[] args) {
        // Rule: httpcomponents-client-4-to-httpcomponents-client-5-00180
        HttpResponse response = null;
        response.getStatusLine();
    }
}
