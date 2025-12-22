package bosscoder.hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    /**
     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
     */

    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(getLongestSequence(nums));
    }

    static int getLongestSequence(int[] input) {
        if (input.length == 0 || input == null) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : input) {
            set.add(num);
        }

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int curStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    curStreak++;
                }
                longest = Math.max(longest, curStreak);
            }
        }
        return longest;
    }


}
