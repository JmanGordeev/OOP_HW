package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat("Bony", 1, 3, "fish");
        Cat myCatOne = new Cat("Tom", 2, 5, "milk");

        System.out.println(myCat.toString());
        myCat.mew();
        myCat.play();
        System.out.println(myCatOne.toString());
        myCatOne.mew();
        myCatOne.play();

    }
}
