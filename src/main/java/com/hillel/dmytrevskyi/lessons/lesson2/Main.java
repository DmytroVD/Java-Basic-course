package com.hillel.dmytrevskyi.lessons.lesson2;

public class Main {

    public static void main(String[] args) {

        byte byteMin = -128;
        byte byteMax = 127;

        System.out.println(byteMin);
        System.out.println(byteMax);

        short shortMin = -32768;

        int someInt = 23232332;

        long someLong = 2323233232l;

        float floatUsd = 33.55345F;

        double doubleUsd = 33.5534543243;

        System.out.println(floatUsd);
        System.out.println(doubleUsd);


        char charVariant1 = 'A';
        char charVariant2 = 65;
        char charVariant3 = '\u0041';

        System.out.println(charVariant1);
        System.out.println(charVariant2);
        System.out.println(charVariant3);

        String someString = """
                Hello World
                Java
                """;

        System.out.println(someString);


        byte byteMin2 = -128;
        Byte byteRef = -128;



    }
}
