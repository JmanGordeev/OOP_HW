package com.gordeev.jman;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface Menu {
    static void menu(Group a) {
        Scanner scanner = new Scanner(System.in);
        int in;
        String temp;
        try {
            for (; ; ) {
                System.out.println("1 - add, 2 - toScreen, 3 - del, 4 - search, 5 - sort, 6 - recruit, 7 - info, 8 - open list, 9 - save list, 0 - exit");
                in = scanner.nextInt();
                if (in == 1) {//added new student
                    a.addStudent();
                }
                if (in == 2) {//Displayed list
                    System.out.println(a.toString());
                    Exit.exit(a);
                }
                if (in == 3) { //deleting student
                    Scanner sc = new Scanner(System.in);
                    System.out.println("LastName?");
                    temp = sc.nextLine();
                    a.deleteStudent("" + temp);

                }
                if (in == 4) { //search student
                    Scanner sc = new Scanner(System.in);
                    System.out.println("LastName?");
                    temp = sc.nextLine();
                    System.out.println(a.searchStudent("" + temp));
                }
                if (in == 5) {
                    Sort.sort(a);
                }
                if (in == 6) {
                    Recruit.getRecruiter(a);
                }
                if (in == 7) {
                    System.out.println("Сделал как смог ))) Вроде на процентов 80 работает...Для работы необходимо сначала заполнить массив студентами ЖМИ 1");
                }

                if (in == 8) {
                    a.loadList();
                }

                if (in == 9) {
                    a.saveStudent();
                }
                if (in == 0) { //EXIT from programme
                    Exit.exit(a);
                }
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("--------select a number from the menu--------");
        }
    }
}

