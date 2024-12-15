package com.DSA.Searching.Linear;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {14, 53, 66, 32, 65, 24, 67};
        int target = 65;
        int location = Search(arr, target);
        System.out.println("The location of the element is " + location);
    }

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
}
