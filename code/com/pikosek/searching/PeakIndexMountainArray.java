package com.pikosek.searching;

public class PeakIndexMountainArray {

    public static void main(String[] args) {
        int[] arr = {5, 6, 10, 15, 20, 50, 70, 90, 100, 110, 100, 90, 50, 40, 30, 29, 10, 5, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;

            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
