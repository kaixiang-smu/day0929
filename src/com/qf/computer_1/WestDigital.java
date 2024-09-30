package com.qf.computer_1;

public class WestDigital extends Disk implements Workable{

    public WestDigital() {
    }

    public WestDigital(String name, double price, int volume) {
        super(name, price, volume);
    }

    @Override
    public String description() {
        String desc;
        desc = "硬盘品牌："+getName()+"硬盘"+"，价钱："+getPrice()+"元，容量："+getVolume()+"G";
        return desc;
    }

    @Override
    public void work() {
        System.out.println(getName() + "品牌硬盘在工作~");
    }
}
