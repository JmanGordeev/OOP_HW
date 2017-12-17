package com.gordeev.jman;

public class Triangle {

    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle() {
    }

    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    public  double getArea() {
        double areaTriangle = 0;
        double p = (lengthA+lengthB+lengthC) / 2;
        if (lengthA > 0 && lengthB > 0 && lengthC > 0) {
            areaTriangle = Math.sqrt(p * (p - lengthA) * (p - lengthB) * (p - lengthC));
        }
        return areaTriangle;
    }
}
