package com.itrex.java.lab.jmm;

public class Counter implements Runnable {

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            count++;
        }

        System.out.println(Thread.currentThread().getName() + ": " + count);
    }

}
