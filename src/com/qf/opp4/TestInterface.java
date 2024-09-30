package com.qf.opp4;

public class TestInterface {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();

        Mic1 mic1 = new Mic1();
        Mic2 mic2 = new Mic2();

        computer.addUSB(mouse);
        computer.addUSB(keyboard);
        computer.addUSB(mic1);
        computer.addUSB(mic2);
        System.out.println("-----------------");
        computer.powerOn();
        System.out.println("-----------------");
        computer.powerOff();

    }
}
