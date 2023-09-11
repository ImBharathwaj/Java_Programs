package Recursive;

public class R07 {
    public static int calculateGCD(int num1, int num2){
        if(num2 == 0){
            return num1;
        }

        int remainder = num1 % num2;

        return calculateGCD(num2, remainder);
    }

    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 18;
        int gcd = calculateGCD(num1, num2);
        System.out.println(gcd);
    }
}
