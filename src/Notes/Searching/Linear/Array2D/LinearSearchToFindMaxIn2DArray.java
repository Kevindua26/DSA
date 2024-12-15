package Notes.Searching.Linear.Array2D;

public class LinearSearchToFindMaxIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 555}
        };

        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Maximum: " + FindMax(arr));
        }
    }
    static int FindMax(int[][] arr) {
        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
