package bosscoder.stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 2;
        int[] result = getMax(nums, k);
        for (int num : result) {
            System.out.print(num + ", ");
        }
    }

    static int[] getMax(int[] input, int k) {
        int i = 0;
        int j = 0;
        int counter = 0;
        int max = Integer.MIN_VALUE;
        int[] result = new int[input.length+1-k];
        while (j < input.length) {
            max = Math.max(max, input[j]);
            if (j - i+1 == k) {
                result[counter++] = max;
                i++;
            }
            j++;
        }
        return result;
    }
}
