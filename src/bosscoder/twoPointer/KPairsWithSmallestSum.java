package bosscoder.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KPairsWithSmallestSum {
    /**
     * Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
     * Output: [[1,2],[1,4],[1,6]]
     * Explanation: The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        List<List<Integer>> result = new ArrayList<>();
        printAllPairs(nums1, nums2, 0, 0, result);
        if(!result.isEmpty()){
            getListWithMinSum(result,k);
        }
    }

    private static void getListWithMinSum(List<List<Integer>> result, int k) {

          while(k-- > 0){
            result.forEach(nums->{
               // nums.get(0)+nums.get(1)==0;
            });
          }
    }

    static void printAllPairs(int[] input1, int[] input2, int i, int j, List<List<Integer>> result) {
        if (i >= input1.length) return;
        if (j >= input2.length) {
            printAllPairs(input1, input2, i + 1, 0, result);
            return;
        }
        result.add(Arrays.asList(input1[i], input2[j]));
        printAllPairs(input1, input2, i, j + 1, result);
    }

}
