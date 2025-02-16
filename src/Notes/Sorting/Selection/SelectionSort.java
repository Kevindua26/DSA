package Notes.Sorting.Selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-7, -5, -23, 0, 4, 23};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            // search for the minimum element in the unsorted part of the array
            int min = getMin(arr, i);
            swap(arr, i, min);
        }
    }

    static int getMin(int[] arr, int start) {
        int min = start;
        for (int i = start + 1; i <= arr.length - 1; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        return min;
    }

    static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
