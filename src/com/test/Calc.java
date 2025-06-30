package com.test;

public class Calc {
    void add() {
        System.out.println("add from Calc called");
    }
}

 class MainClass extends Calc{
     @Override
     void add() {
         super.add();
     }
 }