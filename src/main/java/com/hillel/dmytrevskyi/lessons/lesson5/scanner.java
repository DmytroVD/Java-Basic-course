package com.hillel.dmytrevskyi.lessons.lesson5;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        if (scanner.hasNextInt()) {
            int myInt = scanner.nextInt();
            System.out.println("You entered: " + myInt);
        } else {
            System.out.println("Wrong data");
        }
        scanner.close();
    }
}
