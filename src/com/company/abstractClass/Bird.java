package com.company.abstractClass;

public abstract class Bird {
    String color;
    int weight;
    boolean vegetarian;

    public Bird(String color, int weight, boolean vegetarian) {
        this.color = color;
        this.weight = weight;
        this.vegetarian = vegetarian;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void attack(){
        System.out.println("attack");
    }
}
