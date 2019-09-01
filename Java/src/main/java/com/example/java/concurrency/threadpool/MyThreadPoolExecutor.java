package com.example.java.concurrency.threadpool;

import java.net.ServerSocket;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 1. Why we need a threadPool?
 * Creating and starting a thread can be an expensive process, By repeating this process
 * everytime we need to execute a task, we are incurring a significant performance cost.
 *
 * 2. Why create thread is cost?
 * * allocates memory for a thread stack that holds a stack frame for every method invocation.
 *
 * * each stack frame consists of local variable array, return value, operand stack and constant pool.
 *
 * * each thread gets a program counter that tells it what the current instruction executed by the processor is
 *
 *
 */


public class MyThreadPoolExecutor extends AbstractExecutorService {
    private volatile int mCorePoolSize;
    private volatile int mMaximumPoolSize;
    private volatile long mKeepAliveTime;
    private final BlockingQueue<Runnable> mWorkingQueue;
    private volatile ThreadFactory mThreadFactory;
    private volatile RejectedExecutionHandler mHandler;

    public MyThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        this.mCorePoolSize = corePoolSize;
        this.mMaximumPoolSize = maximumPoolSize;
        this.mKeepAliveTime = unit.toNanos(keepAliveTime);
        this.mWorkingQueue = workQueue;
        this.mThreadFactory = threadFactory;
        this.mHandler = handler;
   }




    @Override
    public void shutdown() {

    }

    @Override
    public List<Runnable> shutdownNow() {
        return null;
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    public boolean awaitTermination(long l, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    @Override
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException();
        }




    }


    @Override
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new MyFutureTask<T>(runnable, t);
    }

    //todo implement abortPolicy
    private static class AbortPolicy implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {

        }
    }









}
