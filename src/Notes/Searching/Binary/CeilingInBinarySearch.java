package Notes.Searching.Binary;

public class CeilingInBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 16;
        int ans = Search(arr, target);
        if (ans == -1) {
            System.out.println("The target is greater than the greatest element in the array");
        } else {
            System.out.println(ans + "th index which is " + arr[ans]);
        }
    }

    static int Search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length -1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        return start;
    }
}
