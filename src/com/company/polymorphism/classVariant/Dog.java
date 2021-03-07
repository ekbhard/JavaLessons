package com.company.polymorphism.classVariant;

public class Dog extends Animal {
    String name;
    int age;

    public Dog(String name, int age) {
        super(name, age);
    }

    public void voice() {
        System.out.println("Wof Wof");
    }
}
