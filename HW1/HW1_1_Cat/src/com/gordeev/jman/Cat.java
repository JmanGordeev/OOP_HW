package com.gordeev.jman;

public class Cat {

    private String name;
    private int age;
    private int weight;
    private String ration;

    public Cat(String name, int age, int weight, String ration) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.ration = ration;
    }

    public Cat() {
    }

    public void mew() {
        System.out.println(name + " say may");
    }

    public void play() {
        System.out.println(name + " play");
    }

    @Override
    public String toString() {
        return "Cat " +
                "name = " + name +
                ", age = " + age +
                ", weight = " + weight +
                ", ration = " + ration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }
}
