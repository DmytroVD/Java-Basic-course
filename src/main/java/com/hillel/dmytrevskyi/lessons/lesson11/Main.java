package com.hillel.dmytrevskyi.lessons.lesson11;

public class Main {
    public static void main(String[] args) {

        Box box1 =new Box();
        Box box2 =new Box();
        Box box3 =new Box();

        box1.a = 10;
        box1.b = 2;
        box1.h = 5;
//        box1.volume();

        box2.a = 20;
        box2.b = 20;
        box2.h = 20;
//        box2.volume();

        ColorBox colorBox1 = new ColorBox();
        colorBox1.a = 10;
        colorBox1.b = 2;
        colorBox1.h = 4;
        colorBox1.color = "red";
//        colorBox1.volume();
//        colorBox1.printColor();
        System.out.println(colorBox1);

        System.out.println(colorBox1.a);
        System.out.println(colorBox1.b);
        System.out.println(colorBox1.h);
        System.out.println(colorBox1.color);


    }

}
