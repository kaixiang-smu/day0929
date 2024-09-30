package com.qf.oop4_1;

public class KeyBoard implements USB{
    @Override
    public void turnOn() {
        System.out.println("键盘开启");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭");
    }
}
