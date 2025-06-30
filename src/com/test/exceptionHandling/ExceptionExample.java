package com.test.exceptionHandling;

import java.nio.file.FileAlreadyExistsException;

public class ExceptionExample {
    public static void main(String[] args) throws Exception {
        System.out.println("start");
        try {
            try {
                System.out.println("division " + 199 / 0);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException exception");
               // System.out.println(90 / 0);
                throw new AgeException("Invalid age");
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) { //syntax experiment
            System.out.println("caught an exception! " + e.toString());
        } catch (IndexOutOfBoundsException e) { //hierarchy of exceptions
            //todo
        } catch (ArithmeticException e) {
            System.out.println("throwing new exception");
            throw new Exception(e);
        } finally {
            System.out.println("finally done!");
        }
        System.out.println("end");
    }
}
