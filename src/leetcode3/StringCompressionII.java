package leetcode3;

/**
 * Example 1:
 *
 * Input: s = "aaabcccd", k = 2
 * Output: 4
 * Explanation: Compressing s without deleting anything will give us "a3bc3d" of length 6. Deleting any of the characters 'a' or 'c' would at most decrease the length of the compressed string to 5, for instance delete 2 'a' then we will have s = "abcccd" which compressed is abc3d. Therefore, the optimal way is to delete 'b' and 'd', then the compressed version of s will be "a3c3" of length 4.
 * Example 2:
 *
 * Input: s = "aabbaa", k = 2
 * Output: 2
 * Explanation: If we delete both 'b' characters, the resulting compressed string would be "a4" of length 2.
 * Example 3:
 *
 * Input: s = "aaaaaaaaaaa", k = 0
 * Output: 3
 * Explanation: Since k is zero, we cannot delete anything. The compressed string is "a11" of length 3.
 */
public class StringCompressionII {
    public static void main(String[] args) {
        String word = "aaabcccd";
        int k=2;
        System.out.println("Output: " + getStringCompressionII(word,k));
    }

    private static int getStringCompressionII(String word, int k) {
        String stringCompression = getStringCompression(word);
        if(k==0){
            return stringCompression.length();
        }


        return 0;
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
            sb.append(word.charAt(i)).append(count);
        }
        return sb.toString();
    }
}
