package com.pkg.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {
    public static void main(String[] args) {
        Set<Integer> num= new HashSet<>();
        num.add(1);
        num.add(7);
        num.add(2);

       //using iterator
        Iterator<Integer> it=num.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //using enahnced for
        for(Integer n:num){
            System.out.println(n);
        }
    }
}
