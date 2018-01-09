package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        Group group = new Group("One");

        Start.start();
        Menu.menu(group);
        Exit.exit(group);
    }
}

