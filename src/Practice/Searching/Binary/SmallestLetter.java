package Practice.Searching.Binary;

public class SmallestLetter {
    // LeetCode 744: Find the smallest letter greater than the target
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'f', 'h'};
        char target = 'g';
        char ans = Search(arr, target);
        System.out.println(ans);
    }

    static char Search(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return arr[start % arr.length];
    }
}
