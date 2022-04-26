package com.hillel.dmytrevskyi.lessons.homework7;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        task();

    }

    public static void task() {
        int[] source = {2, 4, 6, 8};
        int[] target = {3, 5, 7, 9};
        System.out.println("Target: " + Arrays.toString(target));
        System.out.println("Source: " + Arrays.toString(source));

        target = arrayCopy(source, target);
        System.out.println("Target after arrayCopy: " + Arrays.toString(target));


    }
    public static int[] arrayCopy(int[] source, int[] target) {
//        target[0] = 0;
        int[] result = new int[source.length + target.length];

        for(int i = 0; i < target.length; i++) {
            result[i] = target[i];
        }
        for(int i = 0; i < source.length; i++) {
            result[i + target.length] = source[i];
        }
        return result;

    }


}
