package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        Triangle a = new Triangle(3, 4, 3);
        Triangle b = new Triangle(3, 1, 5);

        System.out.println((a.getArea() > 0 ? a.getArea() : "this is not a triangle"));
        System.out.println((b.getArea() > 0 ? b.getArea() : "this is not a triangle"));
    }
}
