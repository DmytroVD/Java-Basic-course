package com.hillel.dmytrevskyi.lessons.homework13;

public class ArithmeticAverage {
    double sum = 0;
    int amount = 0;
    public double getAverage(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                amount++;


            }

        }

        return sum / amount;

    }

    public boolean isSquare(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }

        return true;
        
    }

}
