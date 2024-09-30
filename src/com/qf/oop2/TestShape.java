package com.qf.oop2;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        printShape(circle);
        System.out.println("**************");
        Rect rect = new Rect(10.0,5.0);
        printShape(rect);
    }
    public static void printShape(Shape shape){
        System.out.println(shape.area());
        System.out.println(shape.girth());
    }
}
