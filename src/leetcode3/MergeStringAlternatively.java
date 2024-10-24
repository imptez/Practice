package leetcode3;

import java.util.stream.IntStream;

public class MergeStringAlternatively {
    public static void main(String[] args) {
        String word1="ab";
        String word2="pqr";
        String merged = merge(word1,word2);
        System.out.println(""+merged);
    }

    private static String merge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int length= Math.max(word1.length(),word2.length());

        IntStream.range(0,length)
                .forEach(value -> {
                    if(value<word1.length()){
                        sb.append(word1.charAt(value));
                    }
                    if(value<word2.length()){
                        sb.append(word2.charAt(value));
                    }
                });
        return sb.toString();
    }

    public static String mergeAlternately(String word1, String word2) {

        int size = word1.length() + word2.length();
        StringBuilder str = new StringBuilder();

        for (int i=0; i<size; i++) {

            if (i < word1.length()) str.append(word1.charAt(i));

            if (i < word2.length()) str.append(word2.charAt(i));

        }

        return str.toString();

    }
}
