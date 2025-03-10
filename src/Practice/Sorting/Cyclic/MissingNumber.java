package Practice.Sorting.Cyclic;

public class MissingNumber {
    // Leetcode 268: Missing Number
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        // sorting the array using cyclic sort as the number are from 0 to n
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // finding the missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j) {
                return j;
            }
        }

        // if the n is the missing number
        return arr.length;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}