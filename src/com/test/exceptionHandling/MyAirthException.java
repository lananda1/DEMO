package com.test.exceptionHandling;

public class MyAirthException  extends Exception{
    public MyAirthException() {
        super();
    }

    public MyAirthException(String message) {
        super(message);
    }

    public MyAirthException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyAirthException(Throwable cause) {
        super(cause);
    }

    protected MyAirthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
