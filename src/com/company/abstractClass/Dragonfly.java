package com.company.abstractClass;

public class Dragonfly extends Insect implements Fly {
    @Override
    public void flying() {
        System.out.println("Dragonfly flying");
    }
}
