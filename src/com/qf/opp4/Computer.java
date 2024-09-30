package com.qf.opp4;

public class Computer {

    private USB[] usbArr = new USB[3];

    public USB[] getUsbArr() {
        return usbArr;
    }

    public void setUsbArr(USB[] usbArr) {
        this.usbArr = usbArr;
    }

    public void addUSB(USB usb){
        for (int i = 0; i < usbArr.length; i++) {
            if (usbArr[i] == null){
                usbArr[i] = usb;
                System.out.println("插入成功");
                return;
            }
        }
        System.out.println("插入失败，电脑USB接口已经插满");
    }

    public void powerOn(){
        for (int i = 0; i < usbArr.length; i++) {
            if (usbArr[i]!=null){
                usbArr[i].turnon();
            }
        }
        System.out.println("电脑开机");
    }
    public void powerOff(){
        for (int i = 0; i < usbArr.length; i++) {
            if (usbArr[i]!=null){
                usbArr[i].turnoff();
            }
        }
        System.out.println("电脑关机");
    }

}
