package com.company.polymorphism.interfaceVariant;

public class Dog implements Voice {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println("Wof Wof");
    }
}
