package bosscoder.arrays;

import java.util.Arrays;
import java.util.List;

public class SpecialPositionsInBinaryMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 0, 0),
                Arrays.asList(0, 1, 0),
                Arrays.asList(0, 0, 1)
        );
        System.out.println(solve(matrix));
    }

    static int solve(List<List<Integer>> input) {
        int m = input.size();
        int n = input.get(0).size();
        int countSpecialPosBinaryMatrix = 0;
        int[] rowCount = new int[m];
        int[] columnCount = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (input.get(i).get(j) == 1) {
                    rowCount[i]++;
                    columnCount[j]++;
                }
            }
        }
        for (int x = 0; x < m; x++) {
            if (rowCount[x] == 1) {
                for (int y = 0; y < n; y++) {
                    if (input.get(x).get(y) == 1 && columnCount[y] == 1) {
                        countSpecialPosBinaryMatrix++;
                        break;
                    }
                }
            }
        }
        return countSpecialPosBinaryMatrix;
    }
}
