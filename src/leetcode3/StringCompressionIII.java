package leetcode3;

/**
 * Example 1:
 * <p>
 * Input: word = "abcde"
 * <p>
 * Output: "1a1b1c1d1e"
 * <p>
 * Explanation:
 * <p>
 * Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.
 * <p>
 * For each prefix, append "1" followed by the character to comp.
 * <p>
 * Example 2:
 * <p>
 * Input: word = "aaaaaaaaaaaaaabb"
 * <p>
 * Output: "9a5a2b"
 * <p>
 * Explanation:
 * <p>
 * Initially, comp = "". Apply the operation 3 times, choosing "aaaaaaaaa", "aaaaa", and "bb" as the prefix in each operation.
 * <p>
 * For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
 * For prefix "aaaaa", append "5" followed by "a" to comp.
 * For prefix "bb", append "2" followed by "b" to comp.
 */
public class StringCompressionIII {
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        System.out.println("Output: " + getStringCompression(word));
    }

    private static String getStringCompression(String word) {
        StringBuilder sb = new StringBuilder();
        int len = word.length();
        for (int i = 0, j = 0; i < len; i = j) {
            int count = 0;
            while (j < len && word.charAt(j) == word.charAt(i) && count < 9) {
                ++count;
                ++j;
            }
            sb.append(count).append(word.charAt(i));
        }
        return sb.toString();
    }
}
