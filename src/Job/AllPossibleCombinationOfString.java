package Job;

import java.util.HashSet;

public class AllPossibleCombinationOfString {

    public static void main(String[] args) {
        String rem="ABC";
       // printAllCombination("abc", "");
        HashSet<String> combination = new HashSet<>();
        //printAllCombination2("",rem,combination);
        generatePermutations("", rem,combination);
        combination.forEach(System.out::println);
        System.out.println(combination.size());
    }

    private static void printAllCombination2(String prefix, String rem, HashSet<String> combination) {
        if(!prefix.isEmpty()){
            System.out.println("The prefix is "+prefix);
            combination.add(prefix);
        }
        for(int i=0;i<rem.length();i++){
            printAllCombination2(prefix+rem.charAt(i), rem.substring(i+1),combination);
        }
    }

    static void printAllCombination(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printAllCombination(ros, ans + ch);
        }

    }

    private static void generatePermutations(String prefix, String remaining, HashSet<String> permutations) {
        if (remaining.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                // Choose the current character and form a new prefix
                String newPrefix = prefix + remaining.charAt(i);
                // Remaining characters without the chosen character
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                // Recur with the new prefix and remaining characters
                generatePermutations(newPrefix, newRemaining, permutations);
            }
        }
    }
}
