package leetcode3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetterTilePossibilities {

    public static void main(String[] args) {
        String tile= "AABBBC";
        char[] tileArr= tile.toCharArray();

    }

    public static int getFrequency(String tiles){
        Map<Character, Long> characterFrequency = new HashMap<>();
        for (char chars : tiles.toCharArray()) {
            characterFrequency.merge(chars, 1L, Long::sum);
        }
        return backtracking(characterFrequency);
    }

    private static int backtracking(Map<Character, Long> characterFrequency) {
        return 0;
    }
}
