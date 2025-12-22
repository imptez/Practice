package bosscoder.sorting;

import java.util.ArrayList;
import java.util.List;

public class CountSmallerNumberAfterSelf {

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            arr.add(count);
        }
        arr.forEach(System.out::println);
    }

}
