package com.pikosek.searching;

public class SmallestlETTER {
    public static void main(String[] args){
        char[] arr = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(arr, target));

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        int mid = 0;

        while(start<=end){

            mid = start + (end - start)/2;
            if(target<letters[mid]){
                end = mid - 1;

            }else{
                start = mid + 1;
            }
        }
        return letters[start & letters.length];
    }
    }

    //return greatest number >= target

