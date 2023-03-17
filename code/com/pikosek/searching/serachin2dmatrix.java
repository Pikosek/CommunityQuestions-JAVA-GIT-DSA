package com.pikosek.searching;

import java.util.Arrays;

public class serachin2dmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {5,7,9,12,15},
                {7,9,15,20,25}
        };
        int target = 4;
        System.out.println(Arrays.toString(searchmatrix(arr,target)));

    }
    //ma to sens stary i nie bylo to takie ciezkie, ogólnie to macierze muszą mieć tyle samo kolumn, a to jest matrix, który jest posortwowany
    //w sposób row i col, jak widzisz ostatnia columna w 0 wierszu ma 5, a następny wiersz z ostatnią kolumną ma większą wartość
    // matrix sorted by row and col
    public static int[] searchmatrix(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length -1;
        System.out.println(col);

        while (row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }else{
                col--;

            }
        }
        return new int[]{-1, -1};
    }
}
