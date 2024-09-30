package com.qf.computer_1;

public abstract class Component {
    private double price;
    private String name;

    public Component(){

    }

    public Component(String name,double price) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String description();
}
