package com.pikosek.searching;

public class BinarySerach {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 9;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){  // 1. tr // 2. tr // 3. tr // 4.tr
            int mid = start + (end - start) / 2; // 1. 4 // 2. 1 // 3. 2 + (3-2) / 2 = 2,5 == 2 // 4. 3+(3 -3) /2 == 3
            if(target < arr[mid]){ // 1. true
                end = mid -1; // 1. 3

            }else if (target > arr[mid]){ // 2. true // 3. true
                start = mid + 1; // 2. 2 // 3. 3
            } else { // 4. true
                return mid;
            }
        }
        return -1;
    }





































    //end 3
    //start 2
}
//middle 7
//target 14