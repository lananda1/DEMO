package com.test.exceptionHandling;

class Emp {
    static String name = "TW";

    static {
        System.out.println("initialize variables in static block here");
        name = "TWW";
    }

    {
        System.out.println("instance blocked called");
    }

    static void show() {
        System.out.println("accessed via static method " + name);
    }
}


class MainClass {
    public static void main(String[] args) {
        System.out.println(Emp.name);
        Emp e1 = new Emp();
        e1.name = "NTW"; // not recommended
        Emp e2 = new Emp();
        System.out.println(e2.name);
        Emp.show();
    }
}