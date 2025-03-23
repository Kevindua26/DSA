package Practice.Sorting.Cyclic;

import java.util.Arrays;

public class SetMismatch {
    // Leetcode 645: Set Mismatch
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // finding the missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1) {
                return new int[] {arr[j], j + 1};
            }
        }

        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
