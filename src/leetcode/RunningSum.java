package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningSum {
  public static void main(String[] args) {
    //int[] nums = {1,2,3,4};
    //int[] nums = {1,1,1,1,1};
    int[] nums = {3,1,2,10,1};
    for (int i : runningSum(nums)) {
      System.out.println(i);
    }
  }

  public static int[] runningSum(int[] nums) {
    int[] sum = new int[nums.length];
    sum[0]=nums[0];
    for(int i=0;i<nums.length -1;i++)
    {
      sum[i+1]=sum[i]+nums[i+1];
    }
    return sum;
  }
}
