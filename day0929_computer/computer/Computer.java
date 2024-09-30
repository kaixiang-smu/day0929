package com.qf.computer;

/**
 * 电脑类
 * 电脑类里面有CPU和Disk
 */
public class Computer extends Component implements Workable{

    private CPU cpu;
    private Disk disk;

    public CPU getCpu() {
        return cpu;
    }

    // 参数是抽象父类，由其子类赋值
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    @Override
    public String description() {
        String desc = "品牌："+getName()+"，价钱："+getPrice()+"\r\n";
        desc+="电脑中有处理器："+cpu.description()+"\r\n"; // 多态，运行看子类，谁给CPU赋值就执行谁的description
        desc+="电脑中有硬盘："+disk.description(); // 多态，运行看子类，谁给Disk赋值就执行谁的description
        return desc;
    }

    @Override
    public void work() {
        System.out.println("电脑在工作");
        cpu.work();
        disk.work();
    }

    /**
    public static void main(String[] args) {
        IntelCPU intelCPU = new IntelCPU();
        intelCPU.setName("英特尔");
        intelCPU.setPrice(7999);
        intelCPU.setCoreNum(7);
        System.out.println(intelCPU.description());
        intelCPU.work();
        System.out.println("*******************");
        Seagate seagate = new Seagate();
        seagate.setName("希捷");
        seagate.setPrice(499);
        seagate.setVolume(1024);
        System.out.println(seagate.description());
        seagate.work();
    }
     */
}
