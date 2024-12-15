package Notes.Searching.Linear;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int arr[] = {14, 53, 66, 32, 65, 24, 67};
        int target = 32;
        int location = Search(arr, target , 1, 4);
        System.out.println("The location of the element is " + location);
    }

    static int Search(int arr[], int target, int start, int end) {
        // If array is empty
        if (arr.length == 0) {
            return -1;
        }

        // If array is not empty then start a loop for the elements inside the array
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        // If the range or array doesn't contain the number (target)
        return -1;
    }
}
