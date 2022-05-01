package com.hillel.dmytrevskyi.lessons.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        lottery();




    }
    public static void lottery () {
        final int ARRAY_LENGTH = 7;
        Scanner scanner = new Scanner(System.in);

        int[] arrayCompany = new int[ARRAY_LENGTH];
        int[] arrayGambler = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayCompany[i] = (int) (Math.random() * 10);
        }
        System.out.println("Please enter number from 0 to 9");

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayGambler[i] = getNumber(scanner);
        }

        Arrays.sort(arrayCompany);
        Arrays.sort(arrayGambler);

        int count = 0;
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (arrayCompany[i] == arrayGambler[i]) {
                count++;
            }
            
        }
        System.out.println(Arrays.toString(arrayCompany));
        System.out.println(Arrays.toString(arrayGambler));
        System.out.println("Number of matches = " + count);

    }

    public static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 0 && number <= 9) {
                    return number;

                } else {
                    System.out.println("Please enter number from 0 to 9");

                }

            } else {
                System.out.println("Please enter numerical value");
                scanner.next();
            }

        }
    }


}
