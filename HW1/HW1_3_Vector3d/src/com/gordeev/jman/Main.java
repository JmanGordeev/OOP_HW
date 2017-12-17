package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        Vector3d vOne = new Vector3d(-1, 2, -2);
        Vector3d vTwo = new Vector3d(2, 1, -1);

        Vector3d.sumVectors(vOne, vTwo);
        Vector3d.scalar(vOne, vTwo);
        Vector3d.vector(vOne, vTwo);

    }
}
