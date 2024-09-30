package com.qf.oop2;

public class Rect extends Shape{
    private double l;
    private double w;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public double area() {
        return l*w;
    }

    @Override
    public double girth() {
        return (l+w)*2;
    }

    public Rect(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public Rect() {
    }
}
