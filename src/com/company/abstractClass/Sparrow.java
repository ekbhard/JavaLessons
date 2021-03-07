package com.company.abstractClass;

public class Sparrow extends Bird implements Fly {

    public Sparrow(String color, int weight, boolean vegetarian) {
        super(color, weight, vegetarian);
    }

    @Override
    public void flying() {
        System.out.println("Sparrow flying");
    }
}
