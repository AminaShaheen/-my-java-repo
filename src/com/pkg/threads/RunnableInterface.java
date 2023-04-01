package com.pkg.threads;

public class RunnableInterface {
    public static void main(String[] args) {
        //job1
        System.out.println("Start:");

        //job2:
        Runnable r = new MyTask();
        Thread obj = new Thread(r);
        obj.start();

        //job3
        for (int i = 0; i < 20; i++) {
            System.out.println("Task1");
        }

        //job4
        System.out.println("end");
    }
}

class MyTask implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Task2");
        }
    }
}

