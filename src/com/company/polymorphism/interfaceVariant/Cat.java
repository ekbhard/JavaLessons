package com.company.polymorphism.interfaceVariant;

public class Cat implements Voice {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println("Mey Mey");
    }
}
