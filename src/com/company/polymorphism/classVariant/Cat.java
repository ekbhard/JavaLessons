package com.company.polymorphism.classVariant;

public class Cat extends Animal {
    String name;
    int age;

    public Cat(String name, int age) {
        super(name, age);
    }

    public void voice() {
        System.out.println("Mey Mey");
    }
}
