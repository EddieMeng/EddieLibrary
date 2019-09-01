package com.example.java.concurrency.threadpool.queue;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

//todo implement blocking queue
public class MyLinkedBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E>{

   @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void put(E e) throws InterruptedException {

    }

    @Override
    public boolean offer(E e, long l, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    @Override
    public E take() throws InterruptedException {
        return null;
    }

    @Override
    public E poll(long l, TimeUnit timeUnit) throws InterruptedException {
        return null;
    }

    @Override
    public int remainingCapacity() {
        return 0;
    }

    @Override
    public int drainTo(Collection<? super E> collection) {
        return 0;
    }

    @Override
    public int drainTo(Collection<? super E> collection, int i) {
        return 0;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
