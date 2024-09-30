package com.qf.oop2;

public class Circle extends Shape{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14*r*r;
    }

    @Override
    public double girth() {
        return 2*3.14*r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }
}
