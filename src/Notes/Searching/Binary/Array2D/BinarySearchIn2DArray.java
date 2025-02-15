package Notes.Searching.Binary.Array2D;

import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int target = 29;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column > 0) {
            if (matrix[row][column] == target) {
                return new int[]{row, column};
            }
            if (matrix[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }

        return new int[]{-1, -1};
    }
}
