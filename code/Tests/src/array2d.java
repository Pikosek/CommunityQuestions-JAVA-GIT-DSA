import com.sun.jdi.IntegerValue;

import java.util.Arrays;

//16.03.2023
public class array2d {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {5,7,9}, {8,8,9}};
        int target = 5;
        System.out.println("Wyszukiwanie targetu: " + target + " :" + Arrays.toString(search2d(arr,target)));
        System.out.println("Maksymalna wartosc: " + max(arr));
    }
    public static int[] search2d(int arr[][], int target){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(target == arr[row][col]){
                    return new int[] {row, col};

                }
            }
        }
        return new int[] {-1, -1};
    }
    public static int max(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(max < arr[row][col]){
                    max = arr[row][col];

                }
            }
        }
        return max;
    }
}
