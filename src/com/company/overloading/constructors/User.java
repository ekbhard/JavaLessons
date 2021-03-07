package com.company.overloading.constructors;

public class User extends Employee {

    private String name;
    private int age;
    private String sex;

    public User(int id, String position, int salary, String department,
                String category, String name, int age, String sex) {
        super(id, position, salary, department, category);
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
