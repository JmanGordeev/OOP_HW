package com.gordeev.jman;

public class ArraySumm implements Runnable {

    private int[] array;
    private int begin;
    private int end;
    private int temp;
    private Thread thr;

    public ArraySumm(int[] array, int begin, int end) {

        this.array = array;
        this.begin = begin;
        this.end = end;
    }

    public ArraySumm(int[] array, int begin, int end, Thread thr) {
        this.array = array;
        this.begin = begin;
        this.end = end;
        this.thr = thr;
    }

    @Override
    public void run() {

        getSummthr();

    }

    public int getSummthr() {

        System.out.println(thr.getName());//для проверки что потоеи разные

        for (int i = begin; i <= end; i++) {
            temp += array[i];
        }
        return temp;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public Thread getThr() {
        return thr;
    }

    public void setThr(Thread thr) {
        this.thr = thr;
    }
}
