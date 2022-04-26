package com.hillel.dmytrevskyi.lessons.lesson7;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        task2();

    }
    public static void task2 () {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        int sumTeam1 = 0;
        int sumTeam2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumTeam1 += array[i];
            } else {
                sumTeam2 += array[i];
            }
        }
        System.out.println("Team1 = " + sumTeam1);
        System.out.println("Team2 = " + sumTeam2);
//        if (sumTeam1 > sumTeam2) {
//            System.out.println("Team1  win");
//        }else if  (sumTeam1 < sumTeam2) {
//            System.out.println("Team2 win");
//        } else {
//            System.out.println("Draw");
//        }

        System.out.println(sumTeam1 > sumTeam2
                ? "Team1  win"
                : sumTeam1 < sumTeam2
                ? "Team2 win"
                : "Draw");

    }
}
