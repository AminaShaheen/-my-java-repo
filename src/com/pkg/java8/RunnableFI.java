package com.pkg.java8;

class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside runnable interface");
    }
}

public class RunnableFI {
    public static void main(String[] args) {
        Runnable r = new RunnableImpl();
        Thread t = new Thread(r);
        t.start();

        //using lambda exp

       /*
        Runnable runnable = () -> System.out.println("Inside runnable interface using lambda");
        Thread lambdaThread = new Thread(runnable);
        lambdaThread.start();
        */

        Thread lambdaThread= new Thread(() -> System.out.println("Inside runnable interface using lambda"));
        lambdaThread.start();

    }
}
