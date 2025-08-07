package bosscoder.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransposeMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        solve(matrix).forEach(System.out::println);
    }

    static List<List<Integer>> solve(List<List<Integer>> input) {
        int m = input.size();
        int n = input.get(0).size();
        List<List<Integer>> transposeInput = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> innerTransposeInput = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                innerTransposeInput.add(input.get(j).get(i));
            }
            transposeInput.add(innerTransposeInput);
        }
        return transposeInput;
    }
}
