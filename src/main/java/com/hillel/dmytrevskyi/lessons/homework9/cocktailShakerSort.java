package com.hillel.dmytrevskyi.lessons.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class cocktailShakerSort {
    public static void main(String[] args) {
        task2();



    }

    public static void task2() {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        int[] array2 = new int[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = array2[i]= (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        cocktailSort(array);
        System.out.println(Arrays.toString(array));
        cocktailSort2(array2);
        System.out.println(Arrays.toString(array2));

    }
    public static void cocktailSort(int[] array) {
       int minIndex = 0;
       int maxIndex = array.length - 1;

       int count = 0;

       while (minIndex < maxIndex) {
           count ++;
           for (int i = minIndex; i < maxIndex; i++) {
               count++;
               if (array[i] > array[i + 1]) {
                   int temp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = temp;
               }
           }
           maxIndex--;
           for (int i = maxIndex; i > minIndex; i--) {
               count++;
               if (array[i] < array[i - 1]) {
                   int temp = array[i];
                   array[i] = array[i - 1];
                   array[i - 1] = temp;
               }
           }
           minIndex++;
       }

        System.out.println("count : " + count);


    }

    public static void cocktailSort2(int[] array) {
        int minIndex = 0;
        int maxIndex = array.length - 1;

        int count = 0;

        while (minIndex < maxIndex) {
            count ++;
            for (int i = minIndex, j = maxIndex;
                 i < maxIndex || j > minIndex;
                 i++, j--) {
                count++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            maxIndex--;

            minIndex++;
        }

        System.out.println("count : " + count);


    }

}
