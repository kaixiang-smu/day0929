package com.qf.computer;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("拯救者",2999);

        IntelCPU intelCPU = new IntelCPU("intel",2599,7);

        Seagate seagate = new Seagate("希捷",500,1024);

        /**
            卧槽，这里报了NullPointerException
            百思不得其解，Computer里面的CPU，Disk
                private CPU cpu;
                private Disk disk;
            这里没有set啊！！！
        */
        /**
         * 其实，你要联系实际去想
         * Java是面向对象编程，都是有逻辑的
         * 买一个电脑（new一个computer）
         * 买一个处理器（new一个Disk）
         * 买一个硬盘（new一个Seagate）
         * 买好之后要组件啊，要把处理器和硬盘安装在电脑里啊
         * 也就是   computer.setCpu(intelCPU);
         *         computer.setDisk(seagate);
         * 只有把具体的Cpu和Disk传给Computer
         * 才能   cpu.description()
         *       disk.description()
         *       爷字辈的抽象类才能执行孙子辈的具体类中的方法
         *       才能实现多态
         */
        computer.setCpu(intelCPU); // 报错就是少了这两行  子类对象赋值给父类引用
        computer.setDisk(seagate); // 报错就是少了这两行  子类对象赋值给父类引用

        System.out.println(computer.description());
        computer.work();
    }
}
