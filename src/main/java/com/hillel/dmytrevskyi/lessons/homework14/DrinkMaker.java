package com.hillel.dmytrevskyi.lessons.homework14;

public class DrinkMaker {


    public static void makeDrink(DrinksMachine drinksMachine) {
        System.out.println("Please wait. " + drinksMachine.getTitle() + " is preparing");
        make();
        new Drink();
        System.out.println("Please take your " + drinksMachine.getTitle());

    }


    private static void make() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
