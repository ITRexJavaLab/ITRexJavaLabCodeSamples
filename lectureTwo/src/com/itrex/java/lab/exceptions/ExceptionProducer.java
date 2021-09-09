package com.itrex.java.lab.exceptions;

import com.itrex.java.lab.jmm.Counter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionProducer {

    private final List<Counter> counters = new ArrayList<>();

    public void produceFileNotFoundException() throws IOException {
        try (FileInputStream is = new FileInputStream(new File("not.exist"))) {
            is.available();
        } finally {
            System.out.println("File not found exception produced");
        }
    }

    public void produceStackOverflowException() {
        produceStackOverflowException();
    }

    public void produceOOM() {
        while (true) {
            counters.add(new Counter());
        }
    }

    public void produceSelfException() {
        throw new SelfException("custom value", "some msg");
    }

}
