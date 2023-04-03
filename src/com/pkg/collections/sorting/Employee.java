package com.pkg.collections.sorting;

public class Employee {
    private String name;
    private int id;
    private int age;
    private long salary;

    public Employee(String name, int id, int age, long salary) {
        super();
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
