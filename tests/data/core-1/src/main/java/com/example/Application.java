package com.example;

import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.HttpResponse;
import org.apache.http.Header;

public class Application {
    public void example() throws Exception {
        BasicHttpContext context = new BasicHttpContext();
        HttpResponse response = null;
        Header[] headers = response.getAllHeaders();
    }
}
