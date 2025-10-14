package bosscoder.maths;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        //int[] nums = {0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            if (num == 1) {
                sum++;
            } else {
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        max = Math.max(max, sum);
        return max;
    }


}
