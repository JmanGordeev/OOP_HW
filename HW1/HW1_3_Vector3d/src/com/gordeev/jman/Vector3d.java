package com.gordeev.jman;

public class Vector3d {

    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector3d sumVectors(Vector3d a, Vector3d b) {

        double x1 = a.x;
        double x2 = b.x;
        double y1 = b.y;
        double y2 = b.y;
        double z1 = a.z;
        double z2 = b.z;
        Vector3d sum = new Vector3d(x1 + x2, y1 + y2, z1 + z2);
        System.out.println("Total - " + sum.toString());
        return sum;
    }

    public static Vector3d scalar(Vector3d a, Vector3d b) {

        double x = a.x * b.x;
        double y = a.y * b.y;
        double z = a.z * b.z;

        Vector3d scalar = new Vector3d(x, y, z);
        System.out.println("Scalar product of vectors - " + scalar.toString());
        return scalar;

    }

    public static Vector3d vector(Vector3d a, Vector3d b) {

        double x = (a.y * b.z) - (a.z * b.y);
        double y = -((a.x * b.z) - (a.z * b.x));
        double z = +(a.x * b.y) - (a.y * b.x);

        Vector3d vector = new Vector3d(x, y, z);
        System.out.println("Vector product of vectors - " + vector.toString());
        return vector;

    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }


}
