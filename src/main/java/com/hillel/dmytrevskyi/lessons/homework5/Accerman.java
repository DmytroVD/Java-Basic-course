package com.hillel.dmytrevskyi.lessons.homework5;

public class Accerman {
    public static void main(String[] args) {
        System.out.println(accerman(3,3));

    }
    public static int accerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if ((m > 0) && (n == 0)) {
            return accerman(m - 1, 1);
        } else {
            return accerman(m-1, accerman(m, n-1));
        }
    }

}
