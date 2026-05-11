package com.example;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00010
import org.apache.http.impl.client.CloseableHttpClient;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00020
import org.apache.http.impl.client.HttpClients;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00080
import org.apache.http.impl.client.BasicCookieStore;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00100
import org.apache.http.client.protocol.HttpClientContext;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00110
import org.apache.http.client.methods.HttpPost;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00120
import org.apache.http.message.BasicNameValuePair;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00130
import org.apache.http.NameValuePair;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00170
import org.apache.http.client.ClientProtocolException;

public class Application {
    public static void main(String[] args) {
        CloseableHttpClient client = HttpClients.createDefault();
        BasicCookieStore cookieStore = new BasicCookieStore();
        HttpClientContext context = HttpClientContext.create();
        HttpPost post = new HttpPost("http://example.com");
        NameValuePair pair = new BasicNameValuePair("key", "value");
        try {
            client.getClass();
        } catch (Exception e) {
            ClientProtocolException cpe = new ClientProtocolException("error");
        }
    }
}
