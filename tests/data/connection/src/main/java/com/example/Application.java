package com.example;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import java.util.concurrent.TimeUnit;

public class Application {
    public void example() {
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        cm.closeExpiredConnections();
        cm.closeIdleConnections(30, TimeUnit.SECONDS);
        cm.setConnectionTimeToLive(0, TimeUnit.MILLISECONDS);
    }
}
