package Notes.Searching.Linear;

public class LinearSearchInt {
    public static void main(String[] args) {
        int arr[] = {14, 53, 66, 32, 65, 24, 67};
        int target = 65;
        int location = Search(arr, target);
        System.out.println("The location of the element is " + location);
    }

    // Using For Loop
    static int Search(int arr[], int target) {
        // If array is empty
        if (arr.length == 0) {
            return -1;
        }

        // If array is not empty then start a loop for the elements inside the array
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        // If the array doesn't contain the number (target)
        return -1;
    }

    // Using For Each Loop
    static int Search2(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    // Using True & False
    static boolean Search3(int arr[], int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
