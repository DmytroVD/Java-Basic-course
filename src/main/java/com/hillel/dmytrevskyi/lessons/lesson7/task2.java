package com.hillel.dmytrevskyi.lessons.lesson7;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;

            }
        }
        System.out.println("index: " + index + " " + "probability: " + max);

    }
}
