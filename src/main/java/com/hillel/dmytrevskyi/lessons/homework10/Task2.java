package com.hillel.dmytrevskyi.lessons.homework10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ticTacToe();

    }
    public static void ticTacToe(){

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[0][0] = 1;
                array[0][1] = 2;
                array[0][2] = 3;
                array[1][0] = 4;
                array[1][1] = 5;
                array[1][2] = 6;
                array[2][0] = 7;
                array[2][1] = 8;
                array[2][2] = 9;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Choose from 1 to 9");
//        Scanner scanner = new Scanner(System.in);


    }

    public static int getNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                return number;

            } else {
                System.out.println("Please enter numerical value");
                scanner.next();
            }

        }

    }

}
