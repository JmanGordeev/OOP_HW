package com.gordeev.jman;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
    private int n;

    public FactorialThread(int n) {
        this.n = n;
    }

    public FactorialThread() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    BigInteger calculateFactorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();

        for (int i = n; i <= n; i++) {
            if (th.isInterrupted()) {
                System.out.println(th.getName() + " interrupted !!");
                break;
            }
            System.out.println(th.getName() + " -> " + i + "!=" + calculateFactorial(i));
        }
    }
}
