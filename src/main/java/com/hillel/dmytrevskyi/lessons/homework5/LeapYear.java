package com.hillel.dmytrevskyi.lessons.homework5;

public class LeapYear {
    public static void main(String[] args) {
       boolean result = leapYear(2016);
        System.out.println(result);

    }
    public static boolean leapYear(int year) {
        boolean result = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        return result;


    }
}
