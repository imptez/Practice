package bosscoder.sorting;

public class KthHighestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        bubbleSort(nums, k);
        System.out.println(nums[nums.length - k]);
    }

    private static void bubbleSort(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
