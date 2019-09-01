package com.example.java;

import com.example.java.concurrency.NotifyRunnable;
import com.example.java.concurrency.WaitRunnable;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class MyClass {

    public static void main(String[] args) {
        // create ThreadPoolExecutor actually.

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Executors.newCachedThreadPool();

        // create FinalizableDelegatedExcutorService actually.
        Executors.newSingleThreadExecutor();

        WaitRunnable runnable1 = new WaitRunnable();
        executorService.submit(runnable1);
        try {
            Thread.sleep(5000);
            NotifyRunnable runnable2 = new NotifyRunnable();
            executorService.submit(runnable2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i = 7;
        double d = i;

    }
}
