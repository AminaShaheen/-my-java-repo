package com.pkg.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        System.out.println(list.isEmpty());             //true

        list.add(12);
        list.add(32);
        list.add(2);
        System.out.println(list.get(2));                //2
        list.set(1,11);
        System.out.println(list);                       //12,11,2
        System.out.println(list.size());                //3
        //list.remove();
        System.out.println(list);                       //12,11,2



    }
}
