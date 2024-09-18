package Job;

public class MatchingPair {

    public static int countMatchingPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isMatchingPair(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isMatchingPair(String word1, String word2) {
        // Check if word1 is a suffix of word2 or vice versa
        return word1.equals(word2) || word1.endsWith(word2) || word2.endsWith(word1);
    }

    public static void main(String[] args) {
        String[] words = {"back", "backdoor", "quarterback", "come", "comeon", "forecome"};

        int matchingPairs = countMatchingPairs(words);

        System.out.println("Number of matching pairs: " + matchingPairs);
    }
}

