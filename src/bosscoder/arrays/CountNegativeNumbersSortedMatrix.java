package bosscoder.arrays;

import java.util.Arrays;
import java.util.List;

public class CountNegativeNumbersSortedMatrix {

    public static void main(String[] args) {
        List<List<Integer>> grid = Arrays.asList(
                Arrays.asList(4, 3, 2, -1),
                Arrays.asList(3, 2, 1, -1),
                Arrays.asList(1, 1, -1, -2),
                Arrays.asList(-1, -1, -2, -3)
        );
        List<List<Integer>> grid2 = Arrays.asList(
                Arrays.asList(1, 0),
                Arrays.asList(3, 2)
        );
        System.out.println(solve(grid));
    }

    static int solve(List<List<Integer>> input) {
        int m = input.get(0).size();
        int negCount = 0;
        for (List<Integer> integers : input) {
            int left = 0, right = m - 1;
            int negIndex = m;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (integers.get(mid) < 0) {
                    negIndex = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            negCount += m - negIndex;
        }
        return negCount;
    }

    static int solveBrutForce(List<List<Integer>> input) {

        int m = input.size();
        int n = input.get(0).size();
        int negativeCount = 0;
        for (int i = 0; i < m; i++) {
            if (input.get(i).get(0) >= 0) {
                for (int j = n - 1; j >= 0; j--) {
                    if (input.get(i).get(j) < 0) {
                        negativeCount++;
                    } else {
                        break;
                    }
                }
            }
            for (int x = 0; x < n; x++) {
                if (input.get(i).get(x) < 0) {
                    negativeCount++;
                } else {
                    break;
                }
            }
        }
        return negativeCount;
    }
}
