package com.hillel.dmytrevskyi.lessons.lesson12;

public class Console extends Computer {
    String joystick;

    public Console(String processor, String monitor, double price, double weight, String joystick) {
        super(processor, monitor, price, weight);
        this.joystick = joystick;
    }


    @Override
    public void printInfo () {
        System.out.println("processor='" + processor + '\'' +
                ", monitor='" + monitor + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", joystick='" + joystick);
    }


}
