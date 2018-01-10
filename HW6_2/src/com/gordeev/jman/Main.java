package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (i * 10 * Math.random());
        }

        Thread threadOne = new Thread();
        Thread threadTwo = new Thread();
        Thread threadThree = new Thread();
        Thread threadFour = new Thread();

        ArraySumm arrayOne = new ArraySumm(array, 0, array.length / 4, threadOne);
        ArraySumm arrayTwo = new ArraySumm(array, array.length / 4 + 1, array.length / 4 * 2, threadTwo);
        ArraySumm arrayThree = new ArraySumm(array, array.length / 4 * 2 + 1, array.length / 4 * 3, threadThree);
        ArraySumm arrayFour = new ArraySumm(array, array.length / 4 * 3 + 1, array.length - 1, threadFour);

        try {
            threadOne.start();
            threadTwo.start();
            threadThree.start();
            threadFour.start();

            threadOne.join();
            threadTwo.join();
            threadThree.join();
            threadFour.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long t1 = System.currentTimeMillis();

        ResultSumm summ = new ResultSumm(new ArraySumm[]{arrayOne, arrayTwo, arrayThree, arrayFour});
        System.out.println("Result - " + summ.resultingSumm() + " time - " + (System.currentTimeMillis() - t1));

        System.out.println();

        long t2 = System.currentTimeMillis();
        System.out.println("Result2 - " + summOneThread(array) + " time - " + (System.currentTimeMillis() - t2));

    }

    private static int summOneThread(int[] a) {
        int summOne = 0;
        for (int n : a) {
            summOne += n;
        }
        return summOne;
    }

}
