package com.gordeev.jman;

import java.util.Scanner;

public interface Exit {
    static void exit(Group a) {
        Scanner scanner = new Scanner(System.in);
        int in;
        System.out.println("1 - Exit, 2 - Menu");
        in = scanner.nextInt();
        if (in == 1) {
            System.out.println("Exit from programme. Bye...");
            System.exit(0);
        }
        if (in == 2) {
            Menu.menu(a);
        }

    }
}
