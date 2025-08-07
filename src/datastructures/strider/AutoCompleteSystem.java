package datastructures.strider;

import java.util.*;
import java.util.stream.Collectors;

public class AutoCompleteSystem {
    private final Map<String, Integer> sentenceMap;

    public AutoCompleteSystem(String[] sentences, int[] times) {
        sentenceMap = new HashMap<>();
        for (int i = 0; i < sentences.length; i++) {
            sentenceMap.put(sentences[i], times[i]);
        }
    }

    ArrayList<String> input(char c) {
        return (ArrayList<String>) sentenceMap.entrySet()
                .stream()
                .filter(entry -> entry.getKey().contains(String.valueOf(c))) // Efficient string matching
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) // Descending order
                .map(Map.Entry::getKey)
                .limit(3)// Extract sorted keys
                .collect(Collectors.toList()); // Compatible with Java 8+
    }

}
