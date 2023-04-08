package com.pkg.collections;

import java.util.*;

public class HashMapImplementation {
    public static void main(String[] args) {
        Map<String, Integer> number = new HashMap<>();
        number.put("one", 1);
        number.put("two", 2);
        number.put("three", 3);
        number.put("four", 4);
        number.put("five", 5);
        number.put(null, 5);
        number.put("six", 6);

        System.out.println(number);
        System.out.println(number.isEmpty() + " " + number.size());
        System.out.println(number.containsKey(null));
        System.out.println(number.containsValue(5));
        System.out.println(number.get("two"));
        number.remove(null);
        System.out.println(number);

        //retrieve only keys using keySet()
        Set<String> keys = number.keySet();
        System.out.println(keys);

        //retrieve values using values()
        Collection<Integer> value = number.values();
        System.out.println(value);

        //iterate over HashMap
        Set<Map.Entry<String, Integer>> entries = number.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //iterate using advanced for loop
        for (Map.Entry<String, Integer> entry : number.entrySet()) {
            System.out.println(entry);
        }

    }


}
