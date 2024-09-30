package com.qf.oop4_1;

public class Mouse implements USB{
    @Override
    public void turnOn() {
        System.out.println("鼠标开启");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭");
    }
}
