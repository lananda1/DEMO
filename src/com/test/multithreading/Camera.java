package com.test.multithreading;

public class Camera {
    void click() {
        System.out.println(Thread.currentThread().getName() +"ENTER");
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}


class Family1 extends Thread {
    Camera c;

    Family1(Camera c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.click();
    }
}


class Family2 extends Thread {
    Camera c;

    Family2(Camera c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.click();
    }
}

class MainClass {
    public static void main(String[] args) {
        Camera c = new Camera();
        Family1 f1 = new Family1(c);
        f1.setName("FAMILY1");
        Family2 f2 = new Family2(c);
        f2.setName("FAMILY2");
        f1.start();
        f2.start();
    }
}
