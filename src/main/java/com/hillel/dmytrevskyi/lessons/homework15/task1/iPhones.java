package com.hillel.dmytrevskyi.lessons.homework15.task1;

public class iPhones implements Smartphone, iOS {

    @Override
    public void call() {
        System.out.println("call_iPhones");
    }

    @Override
    public void sms() {
        System.out.println("sms_iPhones");
    }

    @Override
    public void internet() {
        System.out.println("internet_iPhones");
    }

    @Override
    public void iDeviceOperatingSystem() {
        System.out.println("iDeviceOperatingSystem");
    }
}
