package com.hillel.dmytrevskyi.lessons.lesson9;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        task1();

    }
    public static void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println(Arrays.toString(array));
    }
}
