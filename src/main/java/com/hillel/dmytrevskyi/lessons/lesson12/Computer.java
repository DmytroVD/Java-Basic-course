package com.hillel.dmytrevskyi.lessons.lesson12;

public class Computer {

    String processor;
    String monitor;
    double price;
    double weight;

    public Computer(String processor, String monitor, double price, double weight) {
        this.processor = processor;
        this.monitor = monitor;
        this.price = price;
        this.weight = weight;
    }
    public void printInfo () {
        System.out.println("processor='" + processor + '\'' +
                ", monitor='" + monitor + '\'' +
                ", price=" + price +
                ", weight=" + weight);
    }
}
