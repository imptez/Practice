package arrays;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2,3,4,4,4,4,5,8,8,8,9};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j])
                i++;
            nums[i] = nums[j];
        }
        return i + 1;
    }
}
