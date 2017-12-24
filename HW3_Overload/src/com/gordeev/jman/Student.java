package com.gordeev.jman;

public class Student extends Person {

    private double rate;
    private String faculty;


    Student(String name, String lasName, int age, boolean sex, double rate, String faculty) {
        super(name, lasName, age, sex);
        this.rate = rate;
        this.faculty = faculty;
    }

    public Student() {
    }


    @Override
    public String toString() {

        return getName() + " " + getLastName() + " ," + sexStudent(isSex()) + " ," + getAge() + " year," + " rating " + rate + ", faculty " + faculty;
    }

    private String sexStudent(boolean sex) {
        if (this.isSex()) {
            return "Man";
        } else return "Woman";
    }


}
