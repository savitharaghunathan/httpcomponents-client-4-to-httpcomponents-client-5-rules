package com.example;

import org.apache.http.message.BasicNameValuePair;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;

import java.util.List;
import java.util.ArrayList;

public class Application {
    public void example() {
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("key", "value"));
        HttpEntity entity = null;
    }
}
