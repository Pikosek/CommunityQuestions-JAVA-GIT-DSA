import java.util.Arrays;

public class searchin2dmatri {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {5,8,10}, {15,20,25}};
        int target = 5;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    public static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length -1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            } else{
                col--;
            }

        }
        return new int[]{-1,-1};
    }
}
