package com.company.polymorphism.classVariant;

import java.util.Arrays;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 10);
        Animal cat = new Cat("Pushook", 10);
        Animal dog = new Dog("Rex", 10);

        List<Animal> animals = Arrays.asList(animal, cat, dog);
        for (Animal a : animals) {
            a.voice();
        }
    }
}

