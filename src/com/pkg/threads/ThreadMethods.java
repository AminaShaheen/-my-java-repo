package com.pkg.threads;

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        System.out.println(Thread.currentThread().getName());
        System.out.println(t1.getName());
       // t1.setName("Amina");
        System.out.println(t1.getName());
        try{
            t1.start();
            t1.join(100);
            //Thread.sleep(5000);

        }catch(Exception e){
            System.out.println(e);
        }
        try {
            t2.start();
            //t1.join();

        }catch(Exception e){
            System.out.println(e);
        }
        t3.start();
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Current thread is: " + Thread.currentThread().getName());
            //System.out.println(Thread.currentThread().getPriority());

        }
    }
}
