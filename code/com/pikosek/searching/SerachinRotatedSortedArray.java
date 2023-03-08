package com.pikosek.searching;

public class SerachinRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(orderAgnosticBS(arr));
    }


    static  int orderAgnosticBS(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid +1]){
                return mid;
            }else if (arr[mid] < arr[mid -1]){
                return mid-1;
            }
            if(start > arr[mid]){
                end = mid;
            } else if(end < arr[mid]) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
