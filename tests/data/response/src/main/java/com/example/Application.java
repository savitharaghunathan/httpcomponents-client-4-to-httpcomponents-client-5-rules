package com.example;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;

public class Application {
    public void example() throws Exception {
        HttpResponse response = null;
        if (response.getStatusLine().getStatusCode() >= 300) {
            throw new ClientProtocolException("Error");
        }
    }
}
