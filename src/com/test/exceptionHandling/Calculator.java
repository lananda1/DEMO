package com.test.exceptionHandling;

public class Calculator {
    int calDouble(int num) throws MyAirthException {
        if(num == 0) throw new MyAirthException("Zero not allowed");
        if(num <0) throw new MyAirthException("Negative int not allowed");
        return 2*num;
    }
}
