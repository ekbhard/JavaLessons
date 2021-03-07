package com.company.polymorphism.classVariant;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice(){
        System.out.println("arrh!!");
    }
}
