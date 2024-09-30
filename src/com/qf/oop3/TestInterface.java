package com.qf.oop3;

public class TestInterface {
    public static void main(String[] args) {
        // 接口不能创建对象
        // new USB()

        // 接口可以当父类引用
        USB usb = new UDisk();
        usb.chuanshu();

    }
}
