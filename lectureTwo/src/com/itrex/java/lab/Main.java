package com.itrex.java.lab;

import com.itrex.java.lab.exceptions.ExceptionHandler;
import com.itrex.java.lab.jmm.Counter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        executeCounterLogic();
        executeExceptionHandler();
    }

    private static void executeCounterLogic() {
        Counter counter = new Counter();
        Thread threadOne = new Thread(counter, "treadOne");
        Thread threadTwo = new Thread(counter, "treadTwo");

        threadOne.start();
        threadTwo.start();
    }

    private static void executeExceptionHandler() throws IOException {
        ExceptionHandler exceptionHandler = new ExceptionHandler();
        exceptionHandler.execute();
    }

}
