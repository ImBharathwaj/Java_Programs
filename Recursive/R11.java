package Recursive;

import java.util.ArrayList;
import java.util.List;

public class R11 {
    public static List <String> generatePermutation(String str){
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper(str, "", permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(String str, String current, List<String>permutations){
        // Base case
        if(str.isEmpty()){
            permutations.add(current);
            return;
        }

        // Recursive case
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            String remaining = str.substring(0, i)+str.substring(i+1);
            generatePermutationsHelper(remaining, current+ch, permutations);
        }
    }

    public static void main(String[] args){
        String input = "abc";
        List<String> permutations = generatePermutation(input);
        for(String permutation : permutations){
            System.out.println(permutation);
        }
    }
}
