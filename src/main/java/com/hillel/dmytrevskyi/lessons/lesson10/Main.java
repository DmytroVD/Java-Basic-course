package com.hillel.dmytrevskyi.lessons.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//
//        array[1][0] = 4;
//        array[1][1] = 5;
//        array[1][2] = 6;
//
//        array[2][0] = 1;
//        array[2][1] = 1;
//        array[2][2] = 1;

        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number;
                number++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("array [" + i + "][" + j + "] = " + array[i][j] + "\t");
            }
            System.out.println();
        }

        
//        System.out.println(Arrays.deepToString(array));


    }
}
