package Job;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramFrequency {
    public static void main(String[] args) {
        // Input list of strings
        List<String> words = Arrays.asList("listen", "silent", "enlist", "google", "goolge", "cat", "tac", "act", "dog");

        // Find frequency of strings with the same characters (anagrams)
        Map<String, Long> anagramFrequency = words.stream()
                .map(AnagramFrequency::sortString)   // Sort each string by its characters
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));  // Group and count by sorted strings

        // Display the frequencies of anagrams
        System.out.println("Anagram Frequency:");
        anagramFrequency.forEach((sortedString, count) -> {
            System.out.println("Anagrams of '" + sortedString + "': " + count);
        });
    }

    // Helper method to sort characters in a string
    private static String sortString(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

