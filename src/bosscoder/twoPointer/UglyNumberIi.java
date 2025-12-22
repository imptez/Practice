package bosscoder.twoPointer;

import java.util.ArrayList;
import java.util.List;

public class UglyNumberIi {
    /**
     * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
     * Given an integer n, return the nth ugly number.
     * <p>
     * Input: n = 10
     * Output: 12
     * Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
     */

    public static void main(String[] args) {
        System.out.println(getUglyNumber(10));
    }

    static int getUglyNumber(int n) {
        List<Integer> results = new ArrayList<>();
        results.add(1);
        int i = 0;
        int k = 0;
        int j = 0;
        while (results.size() < n) {
            int next = Math.min(results.get(i) * 2, Math.min(results.get(j) * 3, results.get(k) * 5));
            results.add(next);
            if (next == results.get(i) * 2) {
                i++;
            }
            if (next == results.get(j) * 3) {
                j++;
            }
            if (next == results.get(k) * 5) {
                k++;
            }

        }
        return results.get(n - 1);

    }

}
