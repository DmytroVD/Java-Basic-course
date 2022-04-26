package com.hillel.dmytrevskyi.lessons.homework7;

import java.util.Arrays;

public class onedimensionalarray {
    public static void main(String[] args) {
        onedimensionalarray1();

    }

    public static void onedimensionalarray1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        int min = array[0];
        int max = array[0];


        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("min" + min);
        System.out.println("max" + max);


    }

}
