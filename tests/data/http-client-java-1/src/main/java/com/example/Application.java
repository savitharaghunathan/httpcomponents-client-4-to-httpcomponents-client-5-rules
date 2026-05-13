package com.example;

// Rule: httpclient-4-to-httpclient-5-00090
import org.apache.http.HttpEntityEnclosingRequest;

// Rule: httpclient-4-to-httpclient-5-00100
import org.apache.http.protocol.BasicHttpContext;

// Rule: httpclient-4-to-httpclient-5-00110
import org.apache.http.client.methods.HttpRequestBase;

// Rule: httpclient-4-to-httpclient-5-00120
import org.apache.http.HttpResponse;

// Rule: httpclient-4-to-httpclient-5-00130
import org.apache.http.conn.ManagedHttpClientConnection;

import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;

public class Application {
    public static void main(String[] args) {
        // Rule: httpclient-4-to-httpclient-5-00100
        BasicHttpContext context = new BasicHttpContext();

        // Rule: httpclient-4-to-httpclient-5-00140
        HttpMessage message = null;
        Header[] headers = message.getAllHeaders();

        // Rule: httpclient-4-to-httpclient-5-00150
        HttpRequest request = null;
        RequestLine line = request.getRequestLine();
    }
}
