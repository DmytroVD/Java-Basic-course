package com.hillel.dmytrevskyi.lessons.homework3;

import java.util.Random;

public class thirdhomework {
    public static void main(String[] args) {
        division (20, 10);
        random (10);


//     exercise 1
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int attackRateLi = (warriorLi + archerLi + riderLi) * 860;
        System.out.println(attackRateLi);

        int warriorMing = 9;
        int archerMing = 35;
        int riderMing = 12;
        double attackRateMing = ((warriorMing + archerMing + riderMing) * 860) * 1.5;
        System.out.println(attackRateMing);

    }
    //     exercise 2
    public static void division (int a, int b) {
        int result = a / b;
        System.out.println(a / b);

    }
    //     exercise 3
    public static void random (int n) {
        int a = n;
        System.out.println((int) (Math.random() * 20 - a));
        System.out.println((int) (Math.random() * 20 - a));


    }


}
