package com.pikosek.searching;

public class CeilingNumber {
    public static void main(String[] args){
        int[] arr = {5,7,8,9,15,37,50};
        int target = 16;
        System.out.println(binarysearch(arr, target));

    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int mid = 0;
        if(target>=arr[arr.length-1]){
            return -1;
        }


        while(start<=end){

            mid = start + (end - start)/2;
            if(target>arr[mid]){
                start = mid + 1;

            }else if(target<arr[mid]){
                end = mid - 1;
            } else{
                return mid;
            }
        }
        return start;
    }
}
