package com.example.baitapvenha.model;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    private String branch;

    public Employee(int id, String name, int age, int salary, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.branch = branch;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}