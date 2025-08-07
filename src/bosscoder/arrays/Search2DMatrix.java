package bosscoder.arrays;

import java.util.Arrays;
import java.util.List;

public class Search2DMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 3, 5, 7),
                Arrays.asList(10, 11, 16, 20),
                Arrays.asList(23, 30, 34, 60)
        );

        int num = 34;
        System.out.println(solve(matrix, num));
    }

    static boolean solve(List<List<Integer>> input, int target) {

        int m= input.get(0).size();
        for (List<Integer> integers : input) {
            if (target < integers.get(0)) {
                break;
            }
            for (int j = 0; j < m; j++) {
                if (target == integers.get(j)) return true;
            }
        }
        return false;
    }
}
