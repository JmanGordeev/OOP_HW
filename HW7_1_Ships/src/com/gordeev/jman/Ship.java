package com.gordeev.jman;

public class Ship implements Runnable {

    Dock dock;
    private String name;
    private int countCargo = 10;

    public Ship(String name, Dock dock) {
        this.name = name;
        this.dock = dock;
    }

    public Ship() {
    }

    @Override
    public void run() {

        uploading();

    }

    public synchronized void uploading() {

        for (; countCargo != 0; ) {

            countCargo = countCargo - 1;
            dock.setCount(dock.getCount());

            System.out.println("Ship " + getName() + " uploading " + "count Cargo" + getCountCargo() + " " + Thread.currentThread().getName());

            try {
                wait(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountCargo() {
        return countCargo;
    }

    public void setCountCargo(int countCargo) {
        this.countCargo = countCargo;
    }

    public Dock getDock() {
        return dock;
    }

    public void setDock(Dock dock) {
        this.dock = dock;
    }
}
