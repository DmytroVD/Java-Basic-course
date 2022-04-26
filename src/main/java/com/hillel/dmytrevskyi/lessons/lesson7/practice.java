package com.hillel.dmytrevskyi.lessons.lesson7;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

        int[] array = new int[10];

//        array[0] = (int)(Math.random()*11);
//        array[1] = (int)(Math.random()*11);
//        array[2] = (int)(Math.random()*11);

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*11);

        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();

        for (int value : array) {
            if (value == 5) {
                continue;
            }
            System.out.println(value);

        }


        //        System.out.println(Arrays.toString(array));

    }
}
