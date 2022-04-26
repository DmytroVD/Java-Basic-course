package com.hillel.dmytrevskyi.lessons.lesson7;

public class task1 {
    public static void main(String[] args) {
        task();

    }

    public static void task () {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*11);
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");

            }


        }

    }

}
