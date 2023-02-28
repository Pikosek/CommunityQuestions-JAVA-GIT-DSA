package com.pikosek.searching;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastNumberSA {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[] arr, int target){
        return new int[]{binarysearch(arr, target, true), binarysearch(arr, target, false)};
    }

    static int binarysearch(int[] arr, int target, boolean findstart){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;

            }else if (target > arr[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if(findstart){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
    }





































    //end 3
    //start 2

//middle 7
//target 14