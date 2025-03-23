package Practice.Sorting.Cyclic;

class FirstMissingPositive {
    // Leetcode 41: First Missing Positive
    public int firstMissingPositive(int[] arr) {
        // sorting the array using cyclic sort as the number are from 0 to n
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // finding the missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return index;
            }
        }

        // if the n is the missing number
        return arr.length + 1;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}