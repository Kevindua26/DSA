package Practice.Searching.Binary;

public class FindInMountainArray {
    // LeetCode 1095: Find in Mountain Array
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 3, 1};
    }

    static int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = Search(arr, target, 0, peak);
        if (firstTry == -1) {
            int secondTry = Search(arr, target, peak, arr.length - 1);
            return secondTry;
        } else {
            return firstTry;
        }
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) /2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start; // return start or end, because start == end
    }

    static int Search(int arr[], int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
