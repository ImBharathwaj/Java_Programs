package Recursive;

public class R01 {
    public static int calculateFactorial(int n){
        if(n == 0){
            return 1;
        }

        return n*calculateFactorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(12));
    }
}
