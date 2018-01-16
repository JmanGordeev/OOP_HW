package com.gordeev.jman;

import static java.lang.Thread.sleep;

public class Dock {

    private int count = 0;

    public Dock() {
    }

    public synchronized void unloading(int countShip, String name) {

        for (int i = 1; i < countShip + 1; i++) {
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            System.out.println("Ship" + name + " unloading " + "left " + (countShip - i));

        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
