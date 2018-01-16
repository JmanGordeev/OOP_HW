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

        dock.unloading(countCargo, name);

    }

    public void uploading() {

        Thread thread = new Thread(this);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
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
