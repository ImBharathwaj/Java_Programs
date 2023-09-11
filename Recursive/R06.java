package Recursive;

public class R06 {
    public static String reverseString(String str){
        if(str.isEmpty() || str.length() == 1){
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Java, World!";
        System.out.println(reverseString(input));
    }
}
