package com.pkg.java8;

import java.util.function.Consumer;

class Demo implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);

    }
}

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> consumer = new Demo();
        consumer.accept("Amina");

        //using lambda exp

        Consumer<String> consumer1=(s) -> System.out.println(s);
        consumer1.accept("Zahid");

    }
}
