package com.pikosek.searching;

public class OrderAgnosticBS {
    static  int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;


        // find whetever the array is sorted in asceding or desceding
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){  // 1. tr // 2. tr // 3. tr // 4.tr
            int mid = start + (end - start) / 2; // 1. 4 // 2. 1 // 3. 2 + (3-2) / 2 = 2,5 == 2 // 4. 3+(3 -3) /2 == 3
            if (arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){ // 1. true
                    end = mid -1; // 1. 3

                }else{ // 2. true // 3. true
                    start = mid + 1; // 2. 2 // 3. 3
                }
            } else{
                if(target > arr[mid]){ // 1. true
                    end = mid -1; // 1. 3

                }else{ // 2. true // 3. true
                    start = mid + 1; // 2. 2 // 3. 3
                }
            }
        }
        return -1;
    }
}
