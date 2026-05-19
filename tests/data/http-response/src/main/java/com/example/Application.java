package com.example;

// Rule: httpclient-4-to-httpclient-5-00230
import org.apache.http.HttpResponse;

import org.apache.http.Header;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient-4-to-httpclient-5-00230
        HttpResponse response = null;

        // Rule: httpclient-4-to-httpclient-5-00200
        Header[] headers = response.getAllHeaders();
    }
}
