package com.pkg.java8.stream;

import java.util.*;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);

        //using sources:
        //1. Collection
        Collection<String> collection = Arrays.asList("d", "e", "f");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(System.out::println);

        //2. List
        List<String> list = Arrays.asList("g", "h", "i");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);

        //3. Set
        Set<String> set = new HashSet<>(list);
        Stream<String> stream3 = set.stream();
        stream3.forEach(System.out::println);

        //Using Arrays
        String[] array = {"j", "k", "l"};
        Stream<String> stream4 = Arrays.stream(array);
        stream4.forEach(System.out::println);


    }
}
