package Job;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JobsRelatedQuestions {

    private static void printAnagram() {
        System.out.println("Print Method printAnagram()");
        List<String> words = Arrays.asList("listen", "silent", "enlist", "google", "goolge", "cat", "tac", "act", "dog");
        Map<String, Long> anagramMap = words.stream()
                .map(JobsRelatedQuestions::sortedCharacter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        anagramMap.forEach((s, aLong) -> System.out.println("The sorted string is  " + s + " count is " + aLong));
    }

    private static String sortedCharacter(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    private static void allPossibleCombinationOfString() {
        System.out.println("Print Method allPossibleCombinationOfString()");
        String rem = "abc";
        Set<String> combination = new HashSet<>();
        generateAllPossibleCombination("", rem, combination);
    }

    private static void generateAllPossibleCombination(String prefix, String rem, Set<String> combination) {

        if (rem.isEmpty()) {
            System.out.println(prefix);
            combination.add(prefix);
        }
        for (int i = 0; i < rem.length(); i++) {
            generateAllPossibleCombination(prefix + rem.charAt(i), rem.substring(0, i) + rem.substring(i + 1), combination);
        }
    }

    private static void countMatchingPair() {
        System.out.println("Print Method countMatchingPair()");
        String[] words = {"back", "backdoor", "quarterback", "come", "comeon", "forecome"};
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (matchingPair(words[i], words[j])) {
                    count++;
                }
            }
        }
        System.out.println("The matching pair count is " + count);
    }

    private static boolean matchingPair(String word, String word1) {
        return word.equals(word1) || word.endsWith(word1) || word1.endsWith(word);
    }

    private static void findMatchingSkeletons() {
        System.out.println("Print Method findMatchingSkeletons()");
        String word = "hello";
        String[] skeletons = {"h--l", "he-lo", "g-llo", "m-llo", "--llo", "hello"};

        for(String skeleton:skeletons){
            if(matchesSkeleton(word,skeleton)){
                System.out.println(skeleton);
            }
        }
    }

    private static boolean matchesSkeleton(String word, String skeleton) {
        if (word.length() != skeleton.length()) {
            return false; // Lengths must be the same
        }

        for (int i = 0; i < word.length(); i++) {
            if (skeleton.charAt(i) != '-' && word.charAt(i) != skeleton.charAt(i)) {
                return false; // Mismatch found
            }
        }

        return true; // No mismatches
    }

    public static void main(String[] args) {
        printAnagram();
        allPossibleCombinationOfString();
        countMatchingPair();
        findMatchingSkeletons();
    }
}
