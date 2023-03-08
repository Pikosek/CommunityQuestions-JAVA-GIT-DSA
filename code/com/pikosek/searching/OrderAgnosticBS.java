package com.pikosek.searching;

public class OrderAgnosticBS {
    static  int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;


        // find whetever the array is sorted in asceding or desceding
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;

                }else{
                    start = mid + 1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid -1;

                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
