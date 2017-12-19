package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(3, 3);
        Point d = new Point(3, 0);

        Shape myTriangle = new Triangle(a, b, c);
        Shape mySquare = new Rectangle(a, b, c, d);
        Circle myCircle = new Circle(a, b);

        System.out.println("Triangle perimeter " + myTriangle.getPerimeter());
        System.out.println("Triangle Area " + myTriangle.getArea());
        System.out.println();

        System.out.println("Rectangle perimeter " + mySquare.getPerimeter());
        System.out.println("Rectangle Area " + mySquare.getArea());
        System.out.println();

        System.out.println("Circle perimeter " + myCircle.getPerimeter());
        System.out.println("Circle Area " + myCircle.getArea());


    }
}
