package com.hillel.dmytrevskyi.lessons.lesson10;

public class Example1 {
    public static void main(String[] args) {
        task1();

    }
    public static void task1() {
        int[][]array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
            }


    }


}
