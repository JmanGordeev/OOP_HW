package com.gordeev.jman;

import java.util.Arrays;

public class Group {

    private Student[] students = new Student[10];
    private int count;
    private String nameGroup;

    Group(String nameGroup) {
        setNameGroup(nameGroup);
        setCount();
    }

    public Group() {
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    private String getNameGroup() {
        return nameGroup;
    }

    private void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    private void setCount() {
        this.count = 0;
    }

    void addStudent(Student student) {
        System.out.println("added " + student);

        try {
            if (count >= 10) {
                throw new MyException();
            }
            students[count] = student;
            count++;
        } catch (MyException e) {
            System.out.println(student.getName() + " " + student.getLastName() + " could not add - " + e.getLocalizedMessage());
        }
    }

    void deleteStudent(String lastName) {
        boolean switchIf = true;

        System.out.println("deleting " + lastName + "..........");
        for (int i = 0; i < students.length; i++) {
            if (!(students[i] == null) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
                switchIf = false;
            }
        }
        if (switchIf) {
            System.out.println("..........there is no such student");
        }
    }

    String searchStudent(String lastName) {
        String result = "";
        boolean switchIf = true;

        System.out.println("search " + lastName + "..........");
        for (Student student : students) {
            if ((!(student == null)) && student.getLastName().equals(lastName)) {
                result = student.toString();
                switchIf = false;
            }
        }
        if (switchIf) {
            result = "..........there is no such student";
        }
        return result;
    }

    public void studentToDisplay() {

        System.out.println("Group  " + getNameGroup() + ":");
        for (Student student : students) {
            if (!(student == null)) System.out.println(student.toString());
        }
    }


    public void sortStudents() {

        Arrays.sort(students, (a, b) -> CheckedOnNull.NoNull(a, b) != CheckedOnNull.NOT_NULL ? CheckedOnNull.NoNull(a, b) : a.getLastName().compareTo(b.getLastName()));

    }


    @Override
    public String toString() {
//        sortArray();
        sortStudents();
        StringBuilder out = new StringBuilder();
        for (Student student : students) {
            if (!(student == null)) out.append(student.toString()).append("\n");
        }

        return out.toString();
    }
}

class MyException extends Exception {
    @Override
    public String getLocalizedMessage() {
        return " there is no place o_O";

    }
}
