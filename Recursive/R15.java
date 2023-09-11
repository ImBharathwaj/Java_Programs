package Recursive;

import java.util.Arrays;

public class R15 {

    public static boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    public static boolean isSorted(int[] arr, int index) {
        // Base case
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));
        boolean sorted1 = isSorted(arr1);
        System.out.println(sorted1);
        int[] arr2 = {4, 5, 6, 1, 3};
        System.out.println(Arrays.toString(arr2));
        boolean sorted2 = isSorted(arr2);
        System.out.println(sorted2);
    }
}
