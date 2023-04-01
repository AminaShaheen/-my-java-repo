package com.pkg.threads;

public class ThreadClass {
    public static void main(String[] args) {
        //job1
        System.out.println("Start:");

        //job2:
        Task obj = new Task();
        obj.start();

        //job3
        for (int i = 0; i < 20; i++) {
            System.out.println("Task1");
        }
        //job4
        System.out.println("end");
    }
}

class Task extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Task2");
        }
    }
}
