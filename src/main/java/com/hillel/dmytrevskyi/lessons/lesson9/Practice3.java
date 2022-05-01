package com.hillel.dmytrevskyi.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        task3();

    }


    public static void task3 (){
        int n;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n % 2 != 0){
                    break;
                }else {
                    System.out.println("enter % 2");
                }


            } else
                System.out.println("Wrong data. Try again");
        }


        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);

        }
        System.out.println(Arrays.toString(array));
        int length = array.length / 2;
        int[] array1 = Arrays.copyOf(array, length);
        int[] array2 = Arrays.copyOfRange(array1, length, array.length );
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

//        bubbleSort(array);
//        bubbleSortReverse(array);




    }
}
