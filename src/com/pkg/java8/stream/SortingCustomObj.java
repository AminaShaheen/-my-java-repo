package com.pkg.java8.stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCustomObj {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Amina", 20000));
        emp.add(new Employee("Zahid", 9000));
        emp.add(new Employee("Fatima", 100000));

        List<Employee> ascSort = emp.stream().sorted(Comparator.comparingLong(Employee::getSal)).collect(Collectors.toList());
        System.out.println(ascSort);

        List<Employee> descSort = emp.stream().sorted(Comparator.comparingLong(Employee::getSal).reversed()).collect(Collectors.toList());
        System.out.println(descSort);

        //Using lambda exp
        List<Employee> ascLambda = emp.stream().sorted((o1, o2) -> (int) (o1.getSal() - o2.getSal())).collect(Collectors.toList());
        System.out.println(ascLambda);

        List<Employee> descLambda = emp.stream().sorted((o1, o2) -> (int) (o2.getSal() - o1.getSal())).collect(Collectors.toList());
        System.out.println(descLambda);

        //Sorting by name
        System.out.println(emp.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));
        System.out.println(emp.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()));


    }
}

class Employee {
    private String name;
    private long sal;

    public Employee(String name, long sal) {
        this.name = name;
        this.sal = sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public long getSal() {
        return sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
