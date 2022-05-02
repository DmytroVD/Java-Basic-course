package com.hillel.dmytrevskyi.lessons.homework10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        matrix();
    }

    public static void matrix() {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[getNumber(scanner)][getNumber(scanner)];
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number;
                number++;


            }
//            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;

            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

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

