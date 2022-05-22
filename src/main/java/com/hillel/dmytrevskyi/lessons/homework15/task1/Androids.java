package com.hillel.dmytrevskyi.lessons.homework15.task1;

public class Androids implements Smartphone, LinuxOS {

    @Override
    public void call() {
        System.out.println("call_Androids");
    }

    @Override
    public void sms() {
        System.out.println("sms_Androids");
    }

    @Override
    public void internet() {
        System.out.println("internet_Androids");
    }

    @Override
    public void linuxMint() {
        System.out.println("linuxMint");
    }
}
