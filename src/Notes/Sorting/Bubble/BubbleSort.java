package Notes.Sorting.Bubble;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums) {
        int n = nums.length - 1;
        boolean swapped;

        for (int i = 0; i <= n; i++) {
            swapped = false;
            for (int j = 1; j <= n - i; j++) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
