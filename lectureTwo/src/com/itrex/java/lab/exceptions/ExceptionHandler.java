package com.itrex.java.lab.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandler {

    public void execute() throws IOException {
        ExceptionProducer exceptionProducer = new ExceptionProducer();
        catchFileNotFoundException(exceptionProducer);
        catchStackOverflowException(exceptionProducer);
        catchOOM(exceptionProducer);
        catchSelfExceptions(exceptionProducer);
    }

    private void catchFileNotFoundException(ExceptionProducer producer) throws IOException {
        try {
            producer.produceFileNotFoundException();
        } catch (FileNotFoundException ex) {
            log(ex);
        }
    }

    private void catchStackOverflowException(ExceptionProducer producer) {
        try {
            producer.produceStackOverflowException();
        } catch (StackOverflowError ex) {
            log(ex);
        }
    }

    private void catchOOM(ExceptionProducer producer) {
        try {
            producer.produceOOM();
        } catch (OutOfMemoryError ex) {
            log(ex);
        }
    }

    private void catchSelfExceptions(ExceptionProducer producer) {
        try {
            producer.produceSelfException();
        } catch (SelfException ex) {
            System.out.println(ex.getCustomField());
        }
    }

    private void log(Object obj) {
        System.out.println("We catch: " + obj.getClass().getName());
    }

}
