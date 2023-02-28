package com.pikosek.searching;

public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,12,16,24,32,48,65,80,160,200,500};
        int target = 16;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        // condition for the target ta lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // double the box value
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;

            }else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
