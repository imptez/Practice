package Job;

import java.util.PriorityQueue;

public class SortStringInCamelCase {

    /**
     * Sort a given string in CamelCase
     * <p>
     * input: gEeksfOraEEkS
     * <p>
     * output: aEefgkEkrEOsS
     */
    public static String getSortedString(String str, int n) {
        // Create two priority queues to store lowercase and
        // uppercase characters separately
        PriorityQueue<Character> lower
                = new PriorityQueue<>();
        PriorityQueue<Character> upper
                = new PriorityQueue<>();

        // Loop through the string and insert each character
        // into the appropriate queue
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                lower.add(str.charAt(i));
            } else {
                upper.add(str.charAt(i));
            }
        }

        // Loop through the string again and replace each
        // character with the next lowest or highest
        // character in the appropriate queue
        char[] sortedStr = new char[n];
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                Character poll = lower.poll();
                System.out.println(poll);
                sortedStr[i] = poll;
            } else {
                sortedStr[i] = upper.poll();
            }
        }

        // Return the sorted string
        return new String(sortedStr);
    }

      // Driver code
    public static void main(String[] args) {
        String s = "gEeksfOraEEkS";
        int n = s.length();
        System.out.println(getSortedString(s, n));
    }
}
