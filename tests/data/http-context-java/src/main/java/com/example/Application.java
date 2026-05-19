package com.example;

// Rule: httpclient-4-to-httpclient-5-00130
import org.apache.http.protocol.BasicHttpContext;

public class Application {
    public static void main(String[] args) {
        BasicHttpContext context = new BasicHttpContext();
    }
}
