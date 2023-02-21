package com.pikosek.searching;

public class LinearIntegerSerach {
    public static void main(String[] args) {
        String[] arr = {"Kunal", "Matthew", "George", "Victoria"};
        String target = "Matthew";
        System.out.print(linearsearch(arr, target));
    }

    public static String linearsearch(String[] arr, String target) {
        for (String s : arr) {
            if (s.equals(target)) {
                return s;
            }
        }
        return null;
    }
}
