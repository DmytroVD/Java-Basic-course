package com.hillel.dmytrevskyi.lessons.lesson5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 7;

//        boolean booleanFalse = false;
//
//        if (a >= b) {
//            System.out.println("a >= b");
//
//        } else {
//            System.out.println("a < b");
//        }
//
//        if (a > b) {
//            System.out.println("a >= b");
//
//        } else if (a == b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a < b");
//
//        }

//        if (a >= b) {
//            System.out.println("a == b");
//            if (a > b) {
//                if (a!=b) {
//                    System.out.println("a != b");
//                }
//                System.out.println("a > b");
//            }
//            if (a == b) {
//                System.out.println("a == b");
//            }
//
//        } else {
//            System.out.println("a < b");
//            }


//
//        if (a < b) {
//            System.out.println("a < b");
//
//        }

//        if ((a > b) && (a < c) && (b != c)) {
//            System.out.println("its true");
//
//        }
//        if ((a == b) && (++b == 4)) {
//            System.out.println("Yes");
//        }
//        System.out.println(b);
//        String str = ((a == b) && (++b == 4)) ? "Yes" : "No";
//        System.out.println(str);

        String str1 = "a";

        switch (str1) {
            case "a":
                System.out.println("str = a");
            break;
            case "b":
                System.out.println("str = b");
                break;
            case "c":
                System.out.println("str = c");
                break;
            default:
                System.out.println("default");
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number");
        if (scanner.hasNext()) {
            int myInt = scanner.nextInt();
            System.out.println("You entered" + myInt);
        } else {
            System.out.println("Wrong data");
        }
        scanner.close();







        }


    }





