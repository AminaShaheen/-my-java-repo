package com.pkg.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionImplementation {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Amina");
        list.add("Zahid");
        list.add("Zahid");
        list.add(0,"Zahid");
        System.out.println(list);
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(4));
        list.clear();


    }
}
