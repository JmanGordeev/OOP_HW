package com.gordeev.jman;

public class Rectangle extends Shape {

    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();
    private Point d = new Point();

    public Rectangle() {
    }

    Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private double getLength(Point a, Point b) {

        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public double getPerimeter() {
        return (getLength(a, b) + getLength(b, c)) * 2;
    }

    @Override
    public double getArea() {
        return getLength(a, b) * getLength(b, c);
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }
}
