package com.hillel.dmytrevskyi.lessons.lesson9;

import java.util.Arrays;
import java.util.Collections;

public class algoruthm2 {
    public static void main(String[] args) {
        Integer[] array = {5, 2, 67, 0, -7};
//        Arrays.sort(array);
        Arrays.sort(array, Collections.reverseOrder());

//        bubbleSort(array);
        System.out.println(Arrays.toString(array));


    }

    public static void bubbleSort (int[]array) {
        int temp = -1;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]); {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

            }
            count++;

            }
            count++;

        }
        System.out.println("count = " + count);
    }

}
