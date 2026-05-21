package com.example;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.EntityTemplate;
import org.apache.http.HttpRequest;

public class Application {
    public void example() {
        HttpPost post = new HttpPost("http://example.com");
        HttpGet get = new HttpGet("http://example.com");
        HttpRequest request = post;
        Object line = request.getRequestLine();
    }
}
