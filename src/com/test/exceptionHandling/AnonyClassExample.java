package com.test.exceptionHandling;

import java.util.Comparator;

public class AnonyClassExample {
    @FunctionalInterface
    public interface Car {
        void createCar(String make);

        //function interface with default methods
        default void color() {
            System.out.println("blue");
        }
    }

    public static void main(String[] args) {
        Car c = new Car() {

            @Override
            public void createCar(String make) {
                System.out.println("created car " + make);
            }
        };
        c.createCar("mahindra");

        //Lambda to implement functional interface
        //parameters --> body
        Car c1 = (make) -> System.out.println("created care " + make);
        c1.createCar("tata");
        c1.color();

        //multiple parameters
        Comparator<String> comparator = (a1, b2) -> a1.compareTo(b2);
        System.out.println(comparator.compare("safadf", "safadf"));

        //lambda with block body
        Car c3 = type -> {

        };
    }
}
