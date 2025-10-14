package bosscoder.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermitationsII {
    public static void main(String[] args) {
/*
Input: nums = [1,1,2]
Output: [[1,1,2], [1,2,1], [2,1,1]]
 */

        int[] nums={1,1,2};
        List<List<Integer>> result= new ArrayList<>();
        generatePermutation(0,nums,result);
        result.forEach(System.out::println);
    }

    static void generatePermutation(int index,int[] input,List<List<Integer>> result){
       if(index==input.length){
           List<Integer> ds= new ArrayList<>();
           for(int num:input){
               ds.add(num);
           }
           result.add(ds);
           return;
       }

        Set<Integer> used = new HashSet<>(); // to skip duplicate numbers at current recursion level
        for (int i = index; i < input.length; i++) {
            if (used.contains(input[i])) continue; // skip duplicate
            used.add(input[i]);
               swap(index,i,input);
               generatePermutation(index+1,input,result);
               swap(index,i,input);
       }



    }

    private static void swap(int start,int end,int[] nums){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}



