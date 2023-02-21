package com.pikosek.searching;

public class LinearIntegerSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 2;
        System.out.print(Integerlinearserch(arr, target));
    }

    public static int Integerlinearserch(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }



}

