package bosscoder.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxLen(nums));

    }

    static int maxLen(int[] input) {
        int currentSum = 0;
        int maxSum = 0;
        for (int num : input) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
