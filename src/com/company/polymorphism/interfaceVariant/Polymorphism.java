package com.company.polymorphism.interfaceVariant;

import java.util.Arrays;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
        Voice cat = new Cat("Pushook", 10);
        Voice dog = new Dog("Rex", 10);

        List<Voice> animals = Arrays.asList(cat, dog);
        for (Voice a : animals) {
            a.voice();
        }
    }
}

