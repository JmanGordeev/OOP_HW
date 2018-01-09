package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            FactorialThread factorialThread = new FactorialThread(i);
            Thread thread = new Thread(factorialThread);
            thread.start();
            System.out.println(thread.getName() + " -> " + i + "!=" + factorialThread.calculateFactorial(i));

        }
    }
}
