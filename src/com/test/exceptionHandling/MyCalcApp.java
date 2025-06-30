package com.test.exceptionHandling;

import java.util.Scanner;

public class MyCalcApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int inputNum = scanner.nextInt();
        try {
            System.out.println("Double of "+ inputNum + " is " + new Calculator().calDouble(inputNum));
        } catch (MyAirthException e) {
            System.out.println("Oops Error calculating double");
            throw new RuntimeException(e);
        }
    }


}
