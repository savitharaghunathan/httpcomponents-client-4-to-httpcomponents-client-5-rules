package com.example;

// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00140
import org.apache.http.entity.EntityTemplate;
// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00150
import org.apache.http.entity.ContentType;
// Rule: httpcomponents-client-4-to-httpcomponents-client-5-00160
import org.apache.http.HttpEntity;

public class Application {
    public static void main(String[] args) {
        // Rule: httpcomponents-client-4-to-httpcomponents-client-5-00140
        EntityTemplate template = null;

        // Rule: httpcomponents-client-4-to-httpcomponents-client-5-00150
        ContentType ct = ContentType.APPLICATION_JSON;

        // Rule: httpcomponents-client-4-to-httpcomponents-client-5-00160
        HttpEntity entity = null;
    }
}
