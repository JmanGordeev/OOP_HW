package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        Dock dock = new Dock();

        Ship ship1 = new Ship("ship1", dock);
        Ship ship2 = new Ship("ship2", dock);
        Ship ship3 = new Ship("ship3", dock);

        ship1.uploading();
        ship2.uploading();
        ship3.uploading();


    }
}
