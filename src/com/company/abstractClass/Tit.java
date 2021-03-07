package com.company.abstractClass;

public class Tit extends Bird implements Fly {

    public Tit(String color, int weight, boolean vegetarian) {
        super(color, weight, vegetarian);
    }

    @Override
    public void flying() {
        System.out.println("Tit flying");
    }
}
