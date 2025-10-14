package arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] values = twoSum(nums, target);
        for(int value:values){
            System.out.println(value);
        }
    }

    public static int[] twoSumBrutForce(int[] nums, int target) {
        int n= nums.length;
        int arr[]= new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=nums[i];
                    arr[1]=nums[j];
                    return arr;
                }
            }
        }
        return arr;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }else{
                map.put(nums[i],i);
            }

        }
        return new int[]{1,-1};
    }
}
