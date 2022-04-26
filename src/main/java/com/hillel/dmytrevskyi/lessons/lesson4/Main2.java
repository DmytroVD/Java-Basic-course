package com.hillel.dmytrevskyi.lessons.lesson4;

public class Main2 {

    public static void main(String[] args) {
        recursion(0);
    }

    public static void recursion(int iterator) {
        iterator++;
        System.out.println("Stack start (iterator) = " + iterator);
        if (iterator <= 5) {

            recursion(iterator);
        }
        System.out.println("Stack end (iterator) = " + iterator);

    }

}
