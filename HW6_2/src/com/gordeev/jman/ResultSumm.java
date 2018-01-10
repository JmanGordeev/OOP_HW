package com.gordeev.jman;

public class ResultSumm {

    private ArraySumm[] arraySumms;
    private int summ;

    public ResultSumm(ArraySumm[] arraySumms) {
        this.arraySumms = arraySumms;
        this.summ = summ;
    }

    public ResultSumm() {
    }

    public int resultingSumm() {

        for (ArraySumm e : arraySumms) {
            summ += e.getSummthr();
        }
        return summ;
    }


    public ArraySumm[] getArraySumms() {
        return arraySumms;
    }

    public void setArraySumms(ArraySumm[] arraySumms) {
        this.arraySumms = arraySumms;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }
}
