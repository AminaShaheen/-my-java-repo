package com.pkg.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratingOverList {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C", "C++", "Java");

        //basic for loop
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }

        //for each loop
        for (String course : courses) {
            System.out.println(course);
        }

        //using iterator with while loop
        Iterator<String> it = courses.iterator();
        while (it.hasNext()) {
            String course = it.next();
            System.out.println(course);
        }


    }

}


