package bosscoder.arrays;

import java.util.Arrays;
import java.util.List;

public class PracticeProblem {


    static int[] getPairs(List<Integer> input, int target) {
        if (input.contains(target)) return new int[]{target};
        int sum = Integer.MAX_VALUE;
        int[] result = new int[2];

        for (int num : input) {
            int diff = Math.abs(target - num);
            if (diff < Math.abs(target - sum)) {
                sum = num;
                result = new int[]{num};
            }
        }

        for (int i = 0; i < input.size() - 1; i++) {
            int tempSum = input.get(i) + input.get(i + 1);
            int diff = Math.abs(target - tempSum);
            if (diff < Math.abs(target - sum)) {
                sum = tempSum;
                result = new int[]{input.get(i), input.get(i + 1)};
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3, 4, 6, 8, 9, 14);
        int target1 = 15;
        int target2 = 10;

        int[] pair1 = getPairs(arr, target1);
        System.out.print("Closest to " + target1 + ": ");
        for (int val : pair1) System.out.print(val + " ");
        System.out.println();

        int[] pair2 = getPairs(arr, target2);
        System.out.print("Closest to " + target2 + ": ");
        for (int val : pair2) System.out.print(val + " ");
    }
}
