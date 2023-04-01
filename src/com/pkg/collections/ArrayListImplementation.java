package com.pkg.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);
        list2.add(5);
        list2.add(6);
        list2.addAll(list);

        System.out.println(list2 );
    }
}
