package com.test.multithreading;

public class MyThread  extends Thread {
    private final String name;

    MyThread(String name) {
        super(name);
        this.name = name;
    }
    void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + i);
        }
    }
    @Override
    public void run() {
        show();
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("THREAD 1");
        MyThread t2 = new MyThread("THREAD 2");
        MyThread t3 = new MyThread("THREAD 3");
        t1.start();
        t3.start();
        t1.join();
        Thread.sleep(3000);
        t2.start();
    }
}
