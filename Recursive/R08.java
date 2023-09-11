package Recursive;

public class R08 {
    public static <T>int countOccurrences(T[] arr, T target){
        return countOccurrences(arr, target, 0);
    }

    public static < T > int countOccurrences(T[] arr, T target, int index){
        // Base case
        if(index == arr.length){
            return 0;
        }

        // Recursive case
        int count = countOccurrences(arr, target, index+1);
        if(arr[index].equals(target)){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {
                10, 20, 30, 40, 20, 50, 20, 60
        };
        int target = 20;
        int occurrence = countOccurrences(numbers, target);
        System.out.println(occurrence);
    }
}
