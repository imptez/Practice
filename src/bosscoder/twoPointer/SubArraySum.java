package bosscoder.twoPointer;

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println(count(nums, k));
    }

    static int count(int[] input, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;

        while (j < input.length) {
            sum += input[j];
            while (sum > k && i <= j) {
                sum -= input[i];
                i++;
            }
            if (sum == k) {
                count++;
            }
            j++;
        }
        return count;
    }
}

