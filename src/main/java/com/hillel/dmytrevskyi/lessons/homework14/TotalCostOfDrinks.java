package com.hillel.dmytrevskyi.lessons.homework14;

import java.util.Arrays;
import java.util.Scanner;

public class TotalCostOfDrinks {
    private static Scanner scanner = new Scanner(System.in);
    private static int totalPrice = 0;

    public static void main(String[] args) {
        run();
        System.out.println("Total count: " + Drink.count);
        System.out.println("Total price: " + totalPrice);
        scanner.close();

    }

    public static void run() {
        System.out.println("You can buy:" + Arrays.toString(DrinksMachine.values()));

        while (true) {
            DrinksMachine drinksMachine = getDrinkType();
            if (drinksMachine == null) {
                return;
            }

            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.println("You can choose: "
                            + drinksMachine.getTitle() + ", price: " + Drinks.COFFEE_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.COFFEE_PRICE;
                    break;
                }
                case TEA -> {
                    System.out.println("You can choose: "
                            + drinksMachine.getTitle() + ", price: " + Drinks.TEA_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.TEA_PRICE;
                    break;
                }
                case LEMONADE -> {
                    System.out.println("You can choose: "
                            + drinksMachine.getTitle() + ", price: " + Drinks.LEMONADE_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.LEMONADE_PRICE;
                    break;
                }
                case MOJITO -> {
                    System.out.println("You can choose: "
                            + drinksMachine.getTitle() + ", price: " + Drinks.MOJITO_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.MOJITO_PRICE;
                    break;
                }
                case MINERALWATER -> {
                    System.out.println("You can choose: "
                            + drinksMachine.getTitle() + ", price: " + Drinks.MINERALWATER_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.MINERALWATER_PRICE;
                    break;
                }
                case COCACOLA -> {
                    System.out.println("You can choose: "
                            + drinksMachine.getTitle() + ", price: " + Drinks.COCACOLA_PRICE);
                    DrinkMaker.makeDrink(drinksMachine);
                    totalPrice += Drinks.COCACOLA_PRICE;
                    break;
                }
            }

        }

    }
    public static void makeCoffee(){
        System.out.println("Please take your coffee");
    }

    private static DrinksMachine getDrinkType() {

        System.out.println("Please choose drink or enter the word \"stop\"");

        while (true) {
            String str = scanner.next().toUpperCase();

            if (str.equals("STOP")) {
                return null;
            }

            for (DrinksMachine value : DrinksMachine.values()) {
                if (str.equals(value.toString())) {
                   return DrinksMachine.valueOf(str);
                }
            }
            System.out.println("Please choose drink from list: " + Arrays.toString(DrinksMachine.values()));
        }

    }

}
