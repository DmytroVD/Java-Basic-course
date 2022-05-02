package com.hillel.dmytrevskyi.lessons.lesson10;

public class Chess {
    public static void main(String[] args) {
        task2();

    }
    public static void task2() {
        String[][] array = new String[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "B";
                } else {
                    array[i][j] = "W";
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
