package com.pkg.java8;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierDemo implements Supplier<LocalDateTime> {

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

class SupplierDemo1 implements Supplier<Integer> {

    @Override
    public Integer get() {
        return 10;
    }
}

public class SupplierFI {
    public static void main(String[] args) {
        Supplier<LocalDateTime> time = new SupplierDemo();
        System.out.println(time.get());

        Supplier<Integer> num = new SupplierDemo1();
        System.out.println(num.get());

        //using lambda exp

        Supplier<LocalDateTime> lambdaTime = () -> LocalDateTime.now();
        System.out.println(lambdaTime.get());
    }
}
