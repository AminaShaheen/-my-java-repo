package com.pkg.threads;

public class FirstThread extends Thread {
    public void run(){
        System.out.println("Overriding run method");
    }
    public static void main(String[] args) {
        FirstThread obj=new FirstThread();
        obj.start();
        System.out.println("Thread");
    }

}

