package com.pikosek.searching;

public class MinimumSearch {
    public static void main(String[] args) {
        int[] arg = {1,2,-8,4,56};
        System.out.println(min(arg));



    }
    static int min(int[] args){
        int min = args[0];
        for(int i = 1; i<args.length; i++){
            if(min > args[i]){
                min = args[i];

            }

        }
        return min;
    }
}
