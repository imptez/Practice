package bosscoder.arrays;


public class NextPermutation {
    public static void main(String[] args) {
        int[] input = {1,2,3};
        int[] nextPermutation = findNextPermutation(input);
        System.out.print("{ ");
        for (int num : nextPermutation) {
            System.out.print(num + " ");
        }
        System.out.print(" }");
    }

    public static int[] findNextPermutation(int[] nums) {
        int n = nums.length;
        int k, l;

        for (k = n - 2; k >= 0; k--) {
            if (nums[k] < nums[k + 1]) {
                break;
            }
        }
        //k=1
        if (k < 0) {
            reverseArray(nums, 0, n - 1);
        } else {
            for (l = n - 1; l < k; l--) {
                if (nums[l] > nums[k]) {
                    break;
                }
            }
            swapMethod(nums, k, l);
            reverseArray(nums, k + 1, n - 1);
        }
        return nums;
    }

    private static void swapMethod(int[] nums, int k, int l) {
        int temp = nums[k];
        nums[k] = nums[l];
        nums[l] = temp;
    }

    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }


}
