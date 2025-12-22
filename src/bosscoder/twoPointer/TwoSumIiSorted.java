package bosscoder.twoPointer;

public class TwoSumIiSorted {
    public static void main(String[] args) {
        //int[] input = {2, 7, 11, 15}; int target = 9;
        int[] input = {2, 3, 4}; int target = 6;
        int[] result = getIndex(input, target);
        System.out.println(result[0] + " , " + result[1]);
    }

    static int[] getIndex(int[] input, int target) {
        int start = 0;
        int end = input.length - 1;
        int[] result = new int[2];

        while (start < end) {
            int sum = input[start] + input[end];

            if (sum == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                return result;
            } else if (sum < target) {
                start++; // need a bigger sum
            } else {
                end--;   // need a smaller sum
            }
        }

        return result; // default [0, 0] if not found
    }
}

