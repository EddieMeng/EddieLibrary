package com.example.java.concurrency;

public class NotifyRunnable implements Runnable{

    @Override
    public void run() {
        ThreadSafeClass threadSafeClass = ThreadSafeClass.getInstance();
        threadSafeClass.releaseLock();
    }

}
