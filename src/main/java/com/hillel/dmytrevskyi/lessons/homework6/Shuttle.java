package com.hillel.dmytrevskyi.lessons.homework6;

public class Shuttle {
    public static void main(String[] args) {
        shuttle();

    }

    public static void shuttle (){
        int countShuttle = 0;
        int numberShuttle = 0;
        for (int i = 0; countShuttle <= 100; i++) {
            if (check(numberShuttle)) {
                System.out.println("number :" + numberShuttle + " " + "countShuttle :" + countShuttle);
                countShuttle++;
            }
            numberShuttle++;
        }
    }
    public static boolean check (int num){
        return !(num == 4 || num ==9 || num % 10 == 4 || num % 10 == 9 || (num % 100)/10 == 9 || (num % 100)/10 == 4);

    }
}
