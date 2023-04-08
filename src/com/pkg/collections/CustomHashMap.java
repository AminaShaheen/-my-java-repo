package com.pkg.collections;

import java.util.HashMap;
import java.util.Map;

class Student {
    private String firstname;
    private String lastname;

    public Student(String firstname, String lastname) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

public class CustomHashMap {
    public static void main(String[] args) {

        Map<Integer, Student> student = new HashMap<Integer, Student>();

        student.put(1, new Student("Amina", "Shaheen"));
        student.put(2, new Student("Zahid", "Q"));

        System.out.println(student);
    }
}


