package Notes.Searching.Binary;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int asc[] = {1, 3, 5, 7, 9, 11, 13, 15};
        int dsc[] = {15, 13, 11, 9, 7, 5, 3, 1};
        int target = 15;
        int ans = Search(dsc, target);
        System.out.println(ans + "th index");
    }

    static int Search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

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
