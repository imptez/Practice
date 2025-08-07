package bosscoder.arrays;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] input = {3, 2, 1};
        int[] nextPermutation = findNextPermutation(input);
        System.out.print("{ ");
        for (int num : nextPermutation) {
            System.out.print(num + " ");
        }
        System.out.print(" }");
    }

    public static int[] findNextPermutation(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        generateAllPermutation(nums, new ArrayList<>(), result);

        result.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        for (int i = 0; i < result.size(); i++) {
            if (isSame(nums, result.get(i))) {
                if (i + 1 < result.size()) {
                    return toArray(result.get(i + 1));
                } else {
                    // If it's the last one, return the first (i.e., sorted)
                    return toArray(result.get(0));
                }
            }
        }

        return nums; // fallback (should not happen)

    }

    static boolean isSame(int[] nums, List<Integer> list) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != list.get(i)) return false;
        }
        return true;
    }

    static void generateAllPermutation(int[] input, List<Integer> tempList, List<List<Integer>> result) {

        if (tempList.size() == input.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int j : input) {
                if (tempList.contains(j)) continue;
                tempList.add(j);
                generateAllPermutation(input, tempList, result);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    static int[] toArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
