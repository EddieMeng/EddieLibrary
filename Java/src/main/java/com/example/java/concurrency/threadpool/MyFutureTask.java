package com.example.java.concurrency.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


//todo implement future task.
public class MyFutureTask<V> implements RunnableFuture<V> {
    private Callable<V> mCallable;
    private volatile int mState;
    private static final int NEW = 0;

    public MyFutureTask(Runnable r, V result) {
        this.mCallable = Executors.callable(r, result);
        this.mState = NEW;
    }

    @Override
    public void run() {

    }

    @Override
    public boolean cancel(boolean b) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public V get(long l, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
