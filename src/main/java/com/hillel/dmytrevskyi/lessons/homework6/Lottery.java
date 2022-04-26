package com.hillel.dmytrevskyi.lessons.homework6;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        lottery();

    }
    public static void lottery() {
        Scanner scanner = new Scanner(System.in);
        int max = 11;
        int random = (int) (Math.random() * max);
       boolean isWin = false;
       int restart = -2;

       do {
           System.out.println("Input number 0 -10 ");

           for (int i = 4; i >= 0; i--) {
               if (random == getNumber(scanner)) {
                   isWin = true;
                   break;

               } else {
                   System.out.println("Wrong number. Try again. Number of remaining attempts :" + i);
               }

           }
           System.out.println(isWin ?"You won" : " You lost");
           System.out.println("Please enter 1 if you want to continue");
           restart = getNumber(scanner);
       }
       while (restart == 1);

    }

    public static int getNumber (Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result >= 0 && result <= 10) {
                    return result;
                } else {
                    System.out.println("Please enter number from 0 to 10");
                }

            } else {
                System.out.println("Wrong input" + " " +  "Try again");
                scanner.next();
            }
        }
    }

}
