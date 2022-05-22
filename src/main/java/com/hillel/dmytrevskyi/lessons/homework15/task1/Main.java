package com.hillel.dmytrevskyi.lessons.homework15.task1;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        iPhones iPhones = new iPhones();

        androids.call();
        androids.sms();
        androids.internet();
        androids.linuxMint();

        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.iDeviceOperatingSystem();


    }
}
