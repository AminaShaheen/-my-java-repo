package com.pkg.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Amina", 101, 23, 1000));
        list.add(new Employee("Zahid", 100, 25, 5000));
        list.add(new Employee("Ahad", 105, 11, 500));
        list.add(new Employee("Fatima", 102, 14, 1800));

        Collections.sort(list, new MySort());                           //sort by id
        System.out.println(list);

        Collections.sort(list, new SortByName());                       //sort by name
        System.out.println(list);

    }
}

class MySort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId() - o2.getId();                             //asc order
        //return o2.getId()-o1.getId();                             desc order
        //to compare String values
    }
}

class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());                //to compare String values

    }
}
