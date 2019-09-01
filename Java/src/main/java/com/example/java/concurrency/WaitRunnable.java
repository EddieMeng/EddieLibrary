package com.example.java.concurrency;

public class WaitRunnable implements Runnable{

    @Override
    public void run() {
        ThreadSafeClass threadSafeClass = ThreadSafeClass.getInstance();
        threadSafeClass.waitLock();
    }


}
