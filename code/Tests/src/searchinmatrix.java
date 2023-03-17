import java.util.Arrays;

public class searchinmatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{8,9,15}, {25,30,50}};
        System.out.println(Arrays.toString(serachmatrix(arr, 8)));
    }
    public static int[] serachmatrix(int[][] arr, int target){
        int row = 0;
        int col = arr.length -1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }

        }
        return new int[]{-1, -1};
    }
}
