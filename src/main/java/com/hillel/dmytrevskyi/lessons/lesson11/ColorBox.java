package com.hillel.dmytrevskyi.lessons.lesson11;

public class ColorBox extends Box {
    String color;

    public void printColor () {
        System.out.println("color = " + color);
    }
//    public String toString() {
//        return "color = " + color;
//
//
//    }


    @Override
    public String toString() {
        return "ColorBox{" +
                "h=" + h +
                '}';
    }
}
