package Practice.Searching.Binary;

public class PeakIndexInMountainArray {
    //LeetCode 852: Peak Index in a Mountain Array
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 5, 10, 500, 9, 6, 2, 0};
        System.out.println(peakIndexInMountainArray(arr) + "(index) -> " + arr[peakIndexInMountainArray(arr)] + "(value)");
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
}
