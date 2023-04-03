package com.pkg.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty());             //true

        list.add(12);
        list.add(32);
        list.add(2);
        System.out.println(list.get(2));                //2, gets value present at index
        list.set(1, 11);                                //sets value at index
        System.out.println(list);                       //12,11,2

        System.out.println(list.size());                //3
        //list.remove();
        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(2);
        //list.removeAll(list2);
        //list2.clear();
        System.out.println(list + " " + list2);         //12,11,2

        Collections.sort(list);                     //asc order
        System.out.println(list);

        Collections.reverse(list);                  //desc order
        System.out.println(list);

    }
}
