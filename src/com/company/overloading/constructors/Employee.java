package com.company.overloading.constructors;

public class Employee {

    private int id;
    private String position;
    private int salary;
    private String department;
    private String category;

    //this example
    public Employee(int id, String position, int salary, String department, String category) {
        this(id, position, category);
        this.salary = salary;
        this.department = department;
    }

    //call this constructor
    public Employee(int id, String position, String category) {
        this.id = id;
        this.position = position;
        this.category = category;
    }

    public Employee(int id, String position, String department, String category) {
        this(id, position, category);
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getCategory() {
        return category;
    }
}
