package com.example.java.concurrency.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class MyDefaultFactory implements ThreadFactory {


    //todo implement default factory;
    @Override
    public Thread newThread(Runnable runnable) {
        return null;
    }
}
