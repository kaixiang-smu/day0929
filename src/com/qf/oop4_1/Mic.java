package com.qf.oop4_1;

public class Mic implements USB{
    @Override
    public void turnOn() {
        System.out.println("麦克风开启");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭");
    }
}
