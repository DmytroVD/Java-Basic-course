package com.hillel.dmytrevskyi.lessons.homework12;

public class ClientMain {

    public static void main(String[] args) {
        Client client1 = new Client("John", "24", "April", 1993,
                "smith@gmail.com", "3426989", "Smith", 78, 120.80,
                8030.00);
        Client client2 = new Client("James", "16", "June", 1998,
                "williams@gmail.com", "6793456", "Williams", 67, 115.70,
                10080.00);
        Client client3 = new Client("Lisa", "27", "September", 2001,
                "rodriguez@gmail.com", "1154679", "Rodriguez", 62, 115.75,
                10120.00);
        client1.printAccountInfo();
        client2.printAccountInfo();
        client3.printAccountInfo();


    }
}
