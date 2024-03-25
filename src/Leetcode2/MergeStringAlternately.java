package Leetcode2;

public class MergeStringAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("efghijkl","abcd"));
    }

    public static String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        String appendString = "";
        int length = 0;
        if (word1.length() > word2.length()) {
            length = word2.length();
            appendString = word1.substring(length);
        }
        if (word1.length() < word2.length()) {
            length = word1.length();
            appendString = word2.substring(length);
        }
        if (word1.length() == word2.length())
            length = word1.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(ch1[i]).append(ch2[i]);
        }
        sb.append(appendString);

        return sb.toString();
    }
}
