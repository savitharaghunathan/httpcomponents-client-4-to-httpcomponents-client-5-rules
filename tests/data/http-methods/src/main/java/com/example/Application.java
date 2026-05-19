package com.example;

// Rule: httpclient-4-to-httpclient-5-00110
import org.apache.http.HttpEntityEnclosingRequest;

// Rule: httpclient-4-to-httpclient-5-00220
import org.apache.http.client.methods.HttpRequestBase;

import org.apache.http.client.methods.HttpPost;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient-4-to-httpclient-5-00210
        HttpPost request = new HttpPost("http://example.com");
        request.getRequestLine();
    }
}
