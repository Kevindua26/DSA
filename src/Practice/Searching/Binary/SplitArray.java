package Practice.Searching.Binary;

public class SplitArray {
    // LeetCode 410: Split Array Largest Sum
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j); // in the end of the loop this will contain the max item of the array
            end += j;
        }

        // binary search
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;

            for(int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start; // Here start == end, so we can return either of them
    }
}
