package com.example.java.concurrency;

public class SynchronizedVsVolatile {


    private final Object mObject = new Object();
    /**
     * synchronized method vs synchronized block
     *                                 Synchronized Method                              Synchronized Block
     * Duration:  the lock is obtained for the duration of the entired method    you can specify when the lock is needed exactly
     * Monitor:                         class instance                                    you can specify the object lock
     * Flexibility:     allow multiple threads access different methods                    not support
     */

    public synchronized void setValue(int value) {
        this.mValue = value;
    }

    public void setValue2(int value) {
        synchronized (mObject) {
            this.mValue = value;
        }
    }

    /**
     * valatile vs synchronized
     *                                 valatile                              Synchronized
     *                1. valatile only synchronized value of variable       1.synchronized synchronized the value of all
     *                 between thread memory and main memory              variables between thread memory and main memory
     *                2. solve some visibility problems between threads,    2.obtains and releases locks on monitor, force only
     *                it is not a atomic operation                        one thread at a time to execute code block, it is a atomic operation.
     */

    private volatile int mValue;
    public void setValue3(int value) {
        this.mValue = value;
    }

}
