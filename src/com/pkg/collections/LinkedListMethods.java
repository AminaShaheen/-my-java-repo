package com.pkg.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> city = new LinkedList<>();
        city.add("Pune");
        city.add("Banglore");
        city.add("Lko");
        city.add("Hyd");
        city.add("Pune");
        System.out.println(city);

        city.add(1, "Mumbai");
        System.out.println(city);

        city.addFirst("Kushinagar");
        city.addLast("Delhi");
        System.out.println(city);
        //city.remove("Pune");
        System.out.println(city.lastIndexOf("Pune"));
        System.out.println(city.contains("Pune"));


    }
}
