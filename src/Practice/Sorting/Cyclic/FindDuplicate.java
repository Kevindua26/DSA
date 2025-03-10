package Practice.Sorting.Cyclic;

class FindDuplicate {
    // Leetcode 287: Find the Duplicate Number
    // Asked in Google and Microsoft
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicateTwo(arr));
    }

    static int findDuplicateOne(int[] arr) {
        // sorting the array using cyclic sort as the number are from 1 to n
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // finding the duplicate number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 && arr[index] == arr[arr[index] - 1]) {
                return arr[index];
            }
        }

        // if there's no duplicate number just return -1
        return -1;
    }

    static int findDuplicateTwo(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}