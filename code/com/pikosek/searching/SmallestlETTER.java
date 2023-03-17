package com.pikosek.searching;
//a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,r,s,t,u,w,y,z
public class SmallestlETTER {
    public static void main(String[] args){
        char[] arr = {'c','f','j'};
        char target = 'a';
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

