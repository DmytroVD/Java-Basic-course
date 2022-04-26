package com.hillel.dmytrevskyi.lessons.lesson4;

public class AircraftFactory {
    public static void main(String[] args) {
        buildAirplane("Jet", "F52");
        buildAirplane("Boeing", "747", 300);
        buildAirplane("Boeing", "747", 300, 25);
    }

    public static void buildAirplane(String type, String name){
        System.out.println("fighter :" + type + " - " + name);

    }
    public static void buildAirplane(String type, String name, int secondClassPassengers){
        System.out.println("passenger without business class :" + type + " - " + name + ", second class passengers :" + secondClassPassengers);

    }
    public static void buildAirplane(String type, String name, int secondClassPassengers, int firstClassPassengers) {
        System.out.println(
                "business class passenger :" + type + " - " + name
                + ", first class passengers :" + firstClassPassengers
                + ", second class passengers :" + secondClassPassengers);

    }
}
