package com.hillel.dmytrevskyi.lessons.lesson4;

public class Main {

    public static void main(String[] args) {
//       double result = division();
//        System.out.println(result);
//
//        System.out.println(division());
//        int a = getA();
//        int b = getB();
//        calculate(a, b);


        int age = 10;
        System.out.println(age);
        System.out.println(getAge(age));
        System.out.println(age);

        String name = "Den";
        System.out.println(name);
        System.out.println(name);

    }

    public static int getAge(int age) {
        age = 20;
        return age;

//    }
//    public static int getAge() {
//        age = 20;
//        return age;
//    }
//    public static int getAge(int age, int b) {
//        age = 20;
//        return age;
//
//    }
//
//
//    public static String getName(String name) {
//        name = "Alex";
//        return name;

    }



    public static double division() {
        int a = 10;
       double b = 3;

//       System.out.println(age);
       return a / b;

    }

    public static int getA() {
        return getB();

    }
    public static int getB() {
        return 10;

    }


    public static int calculate(int a, int b) {
        int result = a + b;
        return result;
    }



}
