package bosscoder.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroOneMatrix {
    /**
     * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
     * <p>
     * The distance between two adjacent cells is 1.
     */
    public static void main(String[] args) {
        List<List<Integer>> mat = Arrays.asList(Arrays.asList(0, 0, 0),
                Arrays.asList(0, 1, 0),
                Arrays.asList(1, 1, 1));
        solve(mat).forEach(System.out::print);
    }

    public static List<List<Integer>> solve(List<List<Integer>> input) {
        int m = input.size();
        int n = input.get(0).size();
        List<List<Integer>> newArr = new ArrayList<>();
        int maxDistance = m + n;
        for (int i = 0; i < m; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (input.get(i).get(j) == 0) {
                    arr.add(0);
                } else {
                    int minDistance = maxDistance;
                    for (int x = 0; x < m; x++) {
                        for (int y = 0; y < n; y++) {
                            if (input.get(x).get(y) == 0) {
                                int dist = Math.abs(i - x) + Math.abs(j - y);
                                minDistance = Math.min(minDistance, dist);
                            }
                        }
                    }
                    arr.add(minDistance);
                }
            }
            newArr.add(arr);
        }
        return newArr;
    }
}
