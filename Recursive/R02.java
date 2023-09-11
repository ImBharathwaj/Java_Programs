package Recursive;

public class R02 {
    public static int calculateSum(int n){
        if(n == 0){
            return 0;
        }
        return n + calculateSum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(10));
    }
}
