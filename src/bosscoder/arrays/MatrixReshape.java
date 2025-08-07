package bosscoder.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixReshape {
    public static void main(String[] args) {
      List<List<Integer>> mat = Arrays.asList(Arrays.asList(1,2),
                                              Arrays.asList(3,4));
      int r = 1, c = 4;
      solve(mat,r,c).forEach(System.out::println);
    }

    public static List<List<Integer>> solve(List<List<Integer>> input, int r, int c) {
        int m = input.size();
        int n = input.get(0).size();

        if (m * n != r * c) {
            return input;
        }

        List<List<Integer>> newList = new ArrayList<>();
        List<Integer> newInnerList = new ArrayList<>();
        for (List<Integer> integers : input) {
            for (int j = 0; j < n; j++) {
                newInnerList.add(integers.get(j));
                if (newInnerList.size() >= c) {
                    newList.add(new ArrayList<>(newInnerList));
                }
            }

        }
        return newList;
    }

}
