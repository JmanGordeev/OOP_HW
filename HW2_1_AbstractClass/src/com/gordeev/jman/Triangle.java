package com.gordeev.jman;

public class Triangle extends Shape {

    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();

    public Triangle() {
    }

    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getLength(Point a, Point b) {

        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public double getPerimeter() {

        return getLength(a, b) + getLength(b, c) + getLength(c, a);
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - getLength(a, b)) * (p - getLength(b, c)) * (p - getLength(c, a)));
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}

