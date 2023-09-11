package Recursive;

public class R04 {
    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if(firstChar != lastChar){
            return false;
        }

        String remainingSubString = str.substring(1, str.length()-1);
        return isPalindrome(remainingSubString);
    }

    public static void main(String[] args) {
        String p1 = "madam";
        System.out.println(isPalindrome(p1));

        String p2 = "level";
        System.out.println(isPalindrome(p2));

        String p3 = "java";
        System.out.println(isPalindrome(p3));
    }
}
