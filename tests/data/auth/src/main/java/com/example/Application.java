package com.example;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00090
import org.apache.http.impl.client.BasicCredentialsProvider;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00210
import org.apache.http.client.CredentialsProvider;

public class Application {
    public static void main(String[] args) {
        BasicCredentialsProvider basicProvider = new BasicCredentialsProvider();
        CredentialsProvider provider = basicProvider;
    }
}
