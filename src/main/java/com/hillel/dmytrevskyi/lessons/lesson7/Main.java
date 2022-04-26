package com.hillel.dmytrevskyi.lessons.lesson7;

public class Main {
    public static void main(String[] args) {
       int a1 = 1;
       int a2 = 2;
       int a3 = 3;
       int a4 = 4;
       int a5 = 5;

//        boolean[] array2 = new boolean[3];
//        String[] array3 = new String[3];

       int[] array = new int[5];
       int[] array2 = new int[]{1, 2, 3};
       int[] array3 = {(int)Math.random() * 11, 67, 7};


       array[0] = 1;
       array[1] = 2;
       array[2] = 3;
       array[3] = 4;

       if (array.length == 5) {
           array[array.length - 1] = 5;
       }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }




    }
}
