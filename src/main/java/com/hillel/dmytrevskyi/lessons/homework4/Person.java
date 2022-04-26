package com.hillel.dmytrevskyi.lessons.homework4;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));

    }

    public static String personInfo(String name, String surname, String city, String number) {
        String result = "phone: " + name + " " + surname + " " + "city: " + city +", " + "number: " + number;
        return result;


    }

}
