package com.gordeev.jman;

public class Phone {

    private String model;
    private String number;


    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void regOnNetwork() {
        Network.addNumber(number);
    }

    public void call(String numberA) {
        this.number = numberA;
        boolean b = Network.searchForNumbers(numberA);
        if (b) {
            System.out.println("Call " + numberA + "...");
        } else System.out.println("incorrectness of dialed number");
    }

    public String getNumber() {
        return number;
    }


    public void phoneGetInfo() {
        System.out.println("Phone model - " + model + "," + " number - " + number);
    }
}
