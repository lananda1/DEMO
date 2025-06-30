package com.test.multithreading;

public class ThreadLocalExample {
    public static class MyRunnable implements Runnable {
        private static final ThreadLocal<String>  threadLocal = new ThreadLocal<>();
        @Override
        public void run() {
            threadLocal.set(Thread.currentThread().getName() +"ABC");
            System.out.println("Thread " + Thread.currentThread().getName() + " has value: " + threadLocal.get());
        }

        public static void main(String[] args) throws InterruptedException {
            MyRunnable runnable = new MyRunnable();
            Thread t1 = new Thread(runnable, "Thread 1");
            Thread t2 = new Thread(runnable, "Thread 2");
            t1.start();
            t2.start();
            t1.join();
        }
    }
}
