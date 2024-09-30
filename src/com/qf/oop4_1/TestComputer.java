package com.qf.oop4_1;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();
        Mic mic = new Mic();

        computer.addUSB(keyBoard);
        computer.addUSB(mouse);
        computer.addUSB(mic);
        // computer.addUSB(mic);

        computer.powerOn();
        computer.powerOff();
    }

}
