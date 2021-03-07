package com.company.overloading.constructors;

public class TestOverloading {
    public static void main(String[] args) {
        User user = new User(1, "developer", 10000,
                "dev", "first", "Bob", 35, "male");

        System.out.println(user.getId());
        System.out.println(user.getSex());
        System.out.println(user.getDepartment());
        System.out.println(user.getAge());
        System.out.println(user.getName());
        System.out.println(user.getSalary());
    }
}
