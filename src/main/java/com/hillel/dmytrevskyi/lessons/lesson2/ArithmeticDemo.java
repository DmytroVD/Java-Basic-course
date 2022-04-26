package com.hillel.dmytrevskyi.lessons.lesson2;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 3;

        byte byteMin = (byte) -129;  // -128
        System.out.println(byteMin);

        int intVariable = 200;
        byte byteVariable = (byte) intVariable;
        System.out.println(byteVariable);
        int newIntVariable = byteVariable;
        int newIntVariable2 = byteVariable;

        System.out.println(newIntVariable);
        System.out.println(newIntVariable2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);




    }
}
