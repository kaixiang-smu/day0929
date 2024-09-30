package com.qf.oop4_1;

public class Computer {

    private USB[] usbs = new USB[3];

    public USB[] getUsbs() {
        return usbs;
    }

    public void setUsbs(USB[] usbs) {
        this.usbs = usbs;
    }

    public void addUSB(USB usb){
        boolean flag = false;
        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i] == null){
                usbs[i] = usb;
                flag=true;
                System.out.println("插入成功");
                break;
            }
        }
        if (!flag){
            System.out.println("电脑USB插口已插满");
        }
    }

    public void powerOn(){
        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i]!=null){
                usbs[i].turnOn();
            }
        }
        System.out.println("电脑开启");
    }

    public void powerOff(){
        for (int i = 0; i < usbs.length; i++) {
            if (usbs[i]!=null){
                usbs[i].turnOff();
            }
        }
        System.out.println("电脑关闭");
    }

}
