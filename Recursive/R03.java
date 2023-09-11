package Recursive;

public class R03 {
    public static int calculateFibonacci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }

        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(calculateFibonacci(9));
    }
}
