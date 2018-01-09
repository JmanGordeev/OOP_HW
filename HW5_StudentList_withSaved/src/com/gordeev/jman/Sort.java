package com.gordeev.jman;

import java.util.Scanner;

public interface Sort {
    static void sort(Group a) {
        Scanner sc = new Scanner(System.in);
        int in;
        System.out.println("1 - LastName, 2 - age, 3 - ration");
        in = sc.nextInt();

        if (in == 1) {//LastName sort
            a.sortStudents();
        }
        if (in == 2) {//Age sort
            a.sortStudentsAge();
        }
        if (in == 3) {//AgeRate sort
            a.sortStudentsRate();
        }

    }
}
