package com.example;

import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpResponseInterceptor;

public class Application {
    public static void main(String[] args) {
        HttpResponseInterceptor loggingInterceptor = null;
        HttpClientBuilder builder = HttpClients.custom();

        // Rule: httpclient-4-to-httpclient-5-00160
        builder.addInterceptorLast(loggingInterceptor);
    }
}
