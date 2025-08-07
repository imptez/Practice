package bosscoder.arrays;

import java.util.Arrays;
import java.util.List;

public class MatrixDiagonalSum {
    public static int printDiagonals(List<List<Integer>> matrix) {
        if (matrix == null || matrix.isEmpty()) {
            System.out.println("Matrix is empty or null.");
            return 0;
        }

        int n = matrix.size();

        if (matrix.get(0).size() != n) {
            System.out.println("Matrix is not square. Diagonal calculations might be inaccurate.");
            return 0;
        }

        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+matrix.get(i).get(i);
            if(i!=(n-1-i)) {
                sum=sum+matrix.get(i).get(n - 1 - i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        System.out.println(printDiagonals(matrix));

        List<List<Integer>> nonSquareMatrix = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

    }
}
