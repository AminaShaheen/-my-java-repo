package com.pkg.java8;

import java.util.function.Function;

//Input a string and calculates its length
class FunImplement implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
//Using Lambda Expression
public class FunctionFI {
    public static void main(String[] args) {
        Function<String, Integer> fun = (String s) -> s.length();
        System.out.println(fun.apply("Amina"));

    }


}
