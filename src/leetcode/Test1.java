package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {

  public static void main(String[] args) {
    int[] nums = {2,7,11,15};
      List<Integer> ints = Arrays.asList(3,4,2,5,6,7,4,5);
    int target = 9;
    //long x=123l;
    //twoSum(nums,target);

      Map<Boolean, List<Integer>> partitions = ints.stream()
              .collect(Collectors.partitioningBy(y -> y % 2 == 0));
      List<Integer> evens = partitions.get(true);
      List<Integer> odds = partitions.get(false);

      evens.forEach(System.out::print);
      System.out.println();
      odds.forEach(System.out::print);
  }

//  public static void twoSum(int[] nums, int target) {
//    HashMap<Integer,Integer> sumMap = new HashMap<>();
//    for(int i=0;i<nums.length;i++){
//      int num= target-nums[i];
//      if(sumMap.containsKey(num) ){
//        System.out.println(i+"   ,  "+ sumMap.get(num) );
//      }
//      sumMap.put(nums[i], i);
//    }
//  }

  public static void twoSum(int[] nums, int target) {
   List<Integer> sumList = new ArrayList<>();
    for(int i=0;i<nums.length;i++){
      int num= target-nums[i];
      if(sumList.contains(num) ){
        System.out.println(nums[i]+"   ,  "+ num);
      }
      sumList.add(nums[i]);
    }
  }
}
