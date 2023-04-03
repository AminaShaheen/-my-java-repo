package com.pkg.collections;

import java.util.*;

public class HashSetImplementation {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Amina");
        names.add("Ahad");
        names.add(null);                                   //can store only 1 null value
        names.add("Fatima");
        names.add("Amina");                              //will not add duplicate value
        System.out.println(names);                       //[Fatima, Ahad, Amina] no order of insertion

        names.remove("Fatima");
        System.out.println(names);
        //Creating HashSet from ArrayList
        List<Integer> num= Arrays.asList(1,2,3,4);
        System.out.println(num);
        Set<Integer> num1= new HashSet<>(num);
        System.out.println(num1);


    }
}
