package Recursive;

public class R10 {
    public static int calculateStringLength(String str){
        // Base case
        if(str.isEmpty()){
            return 0;
        }

        // Recursive case
        return 1 + calculateStringLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "Java Programs!";
        System.out.println(calculateStringLength(input));
    }
}
