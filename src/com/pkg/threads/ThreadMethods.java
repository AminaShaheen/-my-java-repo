package com.pkg.threads;

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();

        t1.start();
        //System.out.println("Current thread is: " + Thread.currentThread().getName());

        t2.start();
        //System.out.println("Current thread is: " + Thread.currentThread().getName());

        t3.start();


    }
}
class MyThread extends Thread{
     public void run(){
         for (int i=0;i<2;i++) {
             System.out.println("Current thread is: " + Thread.currentThread().getName());
         }
    }
}
