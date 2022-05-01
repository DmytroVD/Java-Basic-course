package com.hillel.dmytrevskyi.lessons.lesson9;

public class algorithm {
    public static void main(String[] args) {
        int[]array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(demo5(array, 5));
    }

    public static int demo5(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;


    }

}
