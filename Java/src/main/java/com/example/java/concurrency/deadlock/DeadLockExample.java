package com.example.java.concurrency.deadlock;


/**
 * DeadLock Condition:
 * 1.互斥条件
 * 2.占有且等待
 * 3.不可强行占有
 * 4.循环等待条件
 */

public class DeadLockExample {
    private static Object sLock1 = new Object();
    private static Object sLock2 = new Object();

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }

    private static class Thread1 extends Thread {

        @Override
        public void run() {
            synchronized (sLock1) {
                System.out.println("Thread 1: Holding lock1...");
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock2...");

                synchronized (sLock2) {
                    System.out.println("Thread1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (sLock2) {
                System.out.println("Thread 2: Holding lock2...");
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock1...");

                synchronized (sLock1) {
                    System.out.println("Thread2: Holding lock 2 & 1...");
                }
            }
        }
    }
}
