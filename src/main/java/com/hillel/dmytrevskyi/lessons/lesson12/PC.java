package com.hillel.dmytrevskyi.lessons.lesson12;

public class PC extends Computer {
    String mouse;

    public PC(String processor, String monitor, double price, double weight, String mouse) {
        super(processor, monitor, price, weight);
        this.mouse = mouse;
    }
    public void printInfo () {
        System.out.println("processor='" + processor + '\'' +
                ", monitor='" + monitor + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", mouse='" + mouse);
    }

}
