package Recursive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class R13 {
    public static int calculateProduct(int[] arr) {
        return calculateProduct(arr, 0, arr.length - 1);
    }

    public static int calculateProduct(int[] arr, int left, int right) {

        // Base case
        if (left == right) {
            return arr[left];
        }

        // Recursive case
        // Taking the middle index of the array
        int mid = (left + right) / 2;
        int productLeft = calculateProduct(arr, left, mid);
        int productRight = calculateProduct(arr, mid + 1, right);

        return productLeft * productRight;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7};
        System.out.println(Arrays.toString(array));
        int maxElement = calculateProduct(array);
        System.out.println(maxElement);
    }
}
