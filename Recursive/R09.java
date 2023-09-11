package Recursive;

public class R09 {
    public static int SumOddNum(int[] arr) {
        return calculateOddSum(arr, 0);
    }

    private static int calculateOddSum(int[] arr, int index) {
        // Base case
        if (index == arr.length) {
            return 0;
        }

        // Recursive case
        int sum = calculateOddSum(arr, index + 1);
        if (arr[index] % 2 != 0) {
            sum += arr[index];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = SumOddNum(numbers);
        System.out.println(sum);
    }
}
