package Practice.Searching.Binary;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int ans = rotationCount(arr);
        System.out.println(ans);
    }

    static int rotationCount(int[] arr) {
        int pivot = findPivotInDuplicacy(arr);
        // pivot itself gives the number of indexes of the pivot element
        // pivot + 1 gives the number of rotations
        return pivot + 1;
    }

    static int findPivotInDuplicacy(int[] arr) {
        // Here to find the pivot in duplicacy, we will ignore the duplicates

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // arr[] = {2, 9, 2, 2, 2}
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                //check if start is pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                // else start will be incremented by 1
                start++;

                // same with the end
                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
