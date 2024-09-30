package com.qf.computer_1;

public class Computer extends Component implements Workable{

    private CPU cpu;
    private Disk disk;

    public Computer(){

    }

    public Computer(String name,double price){
        super(name,price);
    }

    public CPU getCpu() {
        return cpu;
    }

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
        String desc;
        desc = "电脑品牌："+getName()+"，价钱："+getPrice()+"元\r\n";
        desc+=cpu.description()+"\r\n";
        desc+=disk.description();
        return desc;
    }

    @Override
    public void work() {
        cpu.work();
        disk.work();
        System.out.println(getName()+"品牌电脑在工作~");
    }
}
