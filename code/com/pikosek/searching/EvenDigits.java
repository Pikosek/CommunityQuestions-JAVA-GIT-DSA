package com.pikosek.searching;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
             if(even(num)){
                 count++;
             }

        }
        return count;
    }
    static boolean even(int num) {
        int count = 0;
        while(num>0){
            num = num / 10;
            count++;
        }
        return count % 2 == 0;
    }

}
