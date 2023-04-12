package com.pkg.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;


public class SortingStream {
    public static void main(String[] args) {

        //IN ASC ORDER
        List<String> city = Arrays.asList("Calcutta", "Bombay", "Allahabad", "Pune");

        //city.stream().sorted().collect(Collectors.toList());              also sorts in asc order
        List<String> ascSorted = city.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(ascSorted);

        //using lambda
        List<String> ascLambda = city.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(ascLambda);

        //IN DESC ORDER
        List<String> descSorted = city.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descSorted);

        //using lambda
        List<String> descLambda = city.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(descLambda);
    }
}
