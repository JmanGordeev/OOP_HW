package com.gordeev.jman;

public class Main {

    public static void main(String[] args) {

        Group group = new Group("One");

        Student s1 = new Student("Ivan", "B_Ivanov", 20, true, 30.5, "FAP");
        Student s2 = new Student("Antonina", "A_Petrova", 21, false, 50.6, "FAP");
        Student s3 = new Student("Vasili", "C_Sidorov", 22, true, 55.4, "FAP");
        Student s4 = new Student("Anna", "E_Karenina", 21, false, 70.6, "FAP");
        Student s5 = new Student("Sveta", "D_Kot", 19, false, 78.3, "FAP");
        Student s6 = new Student("Ira", "F_Chub", 25, false, 40.8, "FAP");
        Student s7 = new Student("Denis", "G_Vasiliev", 21, true, 55.9, "FAP");
        Student s8 = new Student("Andrey", "H_kripnik", 23, true, 45.0, "FAP");
        Student s9 = new Student("Roman", "T_agar", 24, true, 73.8, "FAP");
        Student s10 = new Student("Artem", "J_mernoff", 27, true, 85.5, "FAP");
        Student s11 = new Student("Peter", "Petroff", 24, true, 81.5, "FAP");

        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);
        group.addStudent(s4);
        group.addStudent(s5);
        group.addStudent(s6);
//        group.addStudent(s7);
//        group.addStudent(s8);
//        group.addStudent(s9);
//        group.addStudent(s10);
//        group.addStudent(s11);//11 element

        System.out.println("-------------------------------------------------------");

        System.out.println(group.toString());
        group.deleteStudent("E_Karenina");

        System.out.println("------------------------------------------");
        System.out.println(group.toString());

        System.out.println("------------------------------------------");
        System.out.println(group.searchStudent("B_Ivanov"));

    }
}
