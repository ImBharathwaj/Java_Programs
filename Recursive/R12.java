package Recursive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class R12 {
    public static int findMaxElement(int[] arr) {
        return findMaxElement(arr, 0, arr.length - 1);
    }

    public static int findMaxElement(int[] arr, int left, int right) {

        // Base case
        if (left == right) {
            return arr[left];
        }

        // Recursive case

        // Taking the middle index of the array
        int mid = (left + right) / 2;
        int maxLeft = findMaxElement(arr, left, mid);
        int maxRight = findMaxElement(arr, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] array = {34, 45, 34, 23, 56, 62, 27, 55};
        System.out.println(Arrays.toString(array));
        int maxElement = findMaxElement(array);
        System.out.println(maxElement);
    }
}
