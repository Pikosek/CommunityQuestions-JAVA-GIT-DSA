package com.pikosek.searching;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastNumberSA {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[] nums, int target){
            int[] ans = {-1, -1};
            int start = binarysearch(nums,target, true);
            int end = binarysearch(nums,target,false);
            ans[0] = start;
            ans[1] = end;

            return ans;
    }

    static int binarysearch(int[] nums, int target, boolean findStart){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        //start point
        while(start <= end){
            int mid = start + (end - start) / 2; //2
            if(target < nums[mid]){
                end = mid -1;

            }else if (target > nums[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if(findStart){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
                //searching for start

                }
            }
        return ans;
        }
    }





































    //end 3
    //start 2

//middle 7
//target 14