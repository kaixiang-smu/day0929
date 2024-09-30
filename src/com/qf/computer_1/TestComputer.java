package com.qf.computer_1;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("联想拯救者",2999);

        IntelCPU intelCPU = new IntelCPU("英特尔",1999,7);

        AMDCPU amdcpu = new AMDCPU("AMD",1899,5);

        Computer computer1 = new Computer("华为",3999);

        Seagate seagate = new Seagate("希捷",999,666);

        WestDigital westDigital = new WestDigital("西部数据",888,588);

        computer.setCpu(intelCPU);
        computer.setDisk(seagate);

        computer1.setCpu(amdcpu);
        computer1.setDisk(westDigital);

        System.out.println("********联想电脑**********");
        System.out.println(computer.description());
        computer.work();

        System.out.println("********华为电脑**********");
        System.out.println(computer1.description());
        computer1.work();

    }
}
