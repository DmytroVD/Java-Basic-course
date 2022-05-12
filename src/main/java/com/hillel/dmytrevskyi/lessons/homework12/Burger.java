package com.hillel.dmytrevskyi.lessons.homework12;

public class Burger {

    private boolean bun;
    private int meat;
    private boolean cheese;
    private boolean greenery;
    private String mayonnaise;

    public Burger(boolean bun, int meat, boolean cheese, boolean greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        printInfo();
    }

    public Burger(boolean bun, int meat, boolean cheese, boolean greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        printInfo();
    }

    public Burger(boolean bun, boolean cheese, boolean greenery) {
        this.bun = bun;
        this.meat = 2;
        this.cheese = cheese;
        this.greenery = greenery;
        printInfo();
    }
    private void printInfo () {
        System.out.println("Burger{" +
                "bun=" + bun +
                ", meat=" + meat +
                ", cheese=" + cheese +
                ", greenery=" + greenery +
                ", mayonnaise=" + mayonnaise +
                '}');
    }


}

