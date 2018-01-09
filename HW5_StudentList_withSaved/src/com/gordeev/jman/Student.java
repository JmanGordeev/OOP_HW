package com.gordeev.jman;

public class Student extends Person {

    private double rate;
    private String faculty = "somehow faculty";


    Student(String name, String lasName, int age, boolean sex, double rate, String faculty) {
        super(name, lasName, age, sex);
        this.rate = rate;
        this.faculty = faculty;
    }

    public Student() {
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {

        return getName() + " " + getLastName() + " " + getAge() + " " + sexStudent(isSex()) + " " + rate;
    }

    private String sexStudent(boolean sex) {
        if (this.isSex()) {
            return "M";
        } else return "W";
    }


}




