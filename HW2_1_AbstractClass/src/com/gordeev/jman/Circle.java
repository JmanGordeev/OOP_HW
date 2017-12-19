package com.gordeev.jman;

public class Circle extends Shape {

    private Point pCentre = new Point();
    private Point pOnCircle = new Point();

    public Circle() {
    }

    Circle(Point pCentre, Point pOnCircle) {
        this.pCentre = pCentre;
        this.pOnCircle = pOnCircle;
    }

    private double getRadius(Point a, Point b) {

        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public double getPerimeter() {

        return Math.PI * 2 * (getRadius(pCentre, pOnCircle));

    }

    @Override
    public double getArea() {

        return Math.PI * ((getRadius(pCentre, pOnCircle)) * (getRadius(pCentre, pOnCircle)));

    }

    public Point getpCentre() {
        return pCentre;
    }

    public void setpCentre(Point pCentre) {
        this.pCentre = pCentre;
    }

    public Point getpOnCircle() {
        return pOnCircle;
    }

    public void setpOnCircle(Point pOnCircle) {
        this.pOnCircle = pOnCircle;
    }
}
