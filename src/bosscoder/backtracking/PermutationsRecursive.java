package bosscoder.backtracking;

import java.util.*;

public class PermutationsRecursive {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] map= new boolean[nums.length];
       // generatePermutationsWithSpaceComplexity(nums, map,ds, result);
        generatePermutationsWithOutSpaceComplexity(0,nums,result);
        // Print results
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    private static void generatePermutationsWithOutSpaceComplexity(int index, int[] nums, List<List<Integer>> result) {
        if(index == nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int num:nums){
                ds.add(num);
            }
            result.add(ds);
            return;
        }

        for(int i=index;i< nums.length;i++){
            swap(index,i,nums);
            generatePermutationsWithOutSpaceComplexity(index+1,nums,result);
            swap(index,i,nums);
        }
    }

    private static void swap(int start,int end,int[] nums){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }

    private static void generatePermutationsWithSpaceComplexity(int[] nums, boolean[] map,List<Integer> ds, List<List<Integer>> result) {

        if(ds.size()== nums.length){
            result.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!map[i]){
                map[i]=true;
                ds.add(nums[i]);
                generatePermutationsWithSpaceComplexity(nums, map,ds, result);
                ds.remove(ds.size()-1);
                map[i]=false;
            }
        }

    }
}
