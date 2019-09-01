package com.example.java.concurrency;

public class ThreadSafeClass {
    private final Object mLock = new Object();
    private static ThreadSafeClass sInstance = null;


    public static synchronized ThreadSafeClass getInstance() {
        if (sInstance == null) {
            sInstance = new ThreadSafeClass();
        }
        return sInstance;
    }

    private ThreadSafeClass() {

    }


    public void waitLock() {
        synchronized (mLock) {
            System.out.println("waitReady");
            try {
                mLock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finish");
        }
    }

    public void releaseLock() {
        synchronized (mLock) {
            System.out.println("releaseReady");
            mLock.notify();
        }
    }




}
