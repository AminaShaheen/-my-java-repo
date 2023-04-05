package com.pkg.objclass;

public class ObjClass {


    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;

        if (a.equals(b)) System.out.println("Equal " + a.hashCode() + " " + b.hashCode());
        else System.out.println("Not equal " + a.hashCode() + " " + b.hashCode());

        ObjClass obj = new ObjClass();
        Class className = obj.getClass();
        System.out.println(className.getName());

        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
    }
}
