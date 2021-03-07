package com.company.abstractClass;

public class Main {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow("Yellow", 2, false);
        System.out.println(sparrow.color);
        sparrow.flying();
    }
}
