package com.hillel.dmytrevskyi.lessons.lesson12;

public class Main {
    public static void main(String[] args) {
//        Computer notebook = new PC(
//                "Intel Core i9",
//                "Samsung 22\"",
//                2000,
//                5,
//                "Logitech 11");
//
//        Computer notebook2 = new Notebook(
//                "Intel Core i5",
//                "Samsung 15\"",
//                1500,
//                2,
//                "Touchpad 4422");
//
//        Computer comp = new Console(
//                "PS5",
//                "Samsung 15\"",
//                1500,
//                2,
//                "joystick 2772");

        Computer[] computers = getComputers();
        printInfo(computers);

    }
    public static Computer[] getComputers() {
        return new Computer[] {
                new PC(
                "Intel Core i9",
                "Samsung 22\"",
                2000,
                5,
                "Logitech 11"),
                new Notebook(
                        "Intel Core i5",
                        "Samsung 15\"",
                        1500,
                        2,
                        "Touchpad 4422"),
                new Console(
                        "PS5",
                        "Samsung 15\"",
                        1500,
                        2,
                        "joystick 2772")
        };

    }
    public static void printInfo(Computer[] computers) {
        for (int i = 0; i < computers.length; i++) {
            computers[i].printInfo();

        }

    }

}
