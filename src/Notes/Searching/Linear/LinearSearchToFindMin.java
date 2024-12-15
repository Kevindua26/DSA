package Notes.Searching.Linear;

public class LinearSearchToFindMin {
    public static void main(String[] args) {
        int arr[] = {14, 53, 66, 32, 65, 2, 67};

        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Minimum: " + FindMin(arr));
        }

    }

    static int FindMin(int arr[]) {
        int min = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (min > arr[index]) {
                min = arr[index];
            }
        }
        return min;
    }
}
