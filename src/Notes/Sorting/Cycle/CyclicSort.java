package Notes.Sorting.Cycle;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
//        sortOne(arr);
        sortTwo(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortOne(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            while (temp != i + 1) {
                swap(arr, i, temp - 1);
                temp = arr[i];
            }
        }
    }

    static void sortTwo(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
