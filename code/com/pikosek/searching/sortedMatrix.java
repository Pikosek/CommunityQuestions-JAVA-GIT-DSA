package com.pikosek.searching;

public class sortedMatrix {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

    }
    //serach in the row provided
    static int[] binarySerach(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};

            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            } else{
                cEnd = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
    public int[] searchsorted(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySerach(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols /2;

        //run the loop of rem
        while (rStart < (rEnd -1)){
            int mid = rStart + (rEnd - rStart) /2;
            if(matrix[mid][cMid] == target)
        }
    }


}
