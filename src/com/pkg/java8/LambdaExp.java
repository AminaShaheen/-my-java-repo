package com.pkg.java8;

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class LambdaExp {
    public static void main(String[] args) {
        // Shape c=new Circle();
        // c.draw();

        Shape circleLambda = () -> System.out.println("Circle");
        circleLambda.draw();

      //  Shape rectangle = () -> System.out.println("Rectangle");
      //  rectangle.draw();

        print(() -> System.out.println("Rectangle"));


    }
    private static void print(Shape s){
        s.draw();
    }
}
