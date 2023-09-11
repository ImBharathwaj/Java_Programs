package Recursive;

public class R05 {
    public static double calculateExponent(double base, int expo){
        if(expo == 0){
            return 1;
        }

        return base * calculateExponent(base, expo-1);
    }

    public static void main(String[] args) {
        System.out.println(calculateExponent(3.5, 4));
    }
}
