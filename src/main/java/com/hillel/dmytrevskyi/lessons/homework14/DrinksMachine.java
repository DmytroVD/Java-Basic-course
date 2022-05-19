package com.hillel.dmytrevskyi.lessons.homework14;

public enum DrinksMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERALWATER("Mineral water"),
    COCACOLA("Coca Cola");

    private String title;

    DrinksMachine(String title) {

        this.title = title;
    }

    public String getTitle() {

        return title;
    }
}
