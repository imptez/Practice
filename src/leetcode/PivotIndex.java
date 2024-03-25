package leetcode;

public class PivotIndex {

  public static void main(String[] args) {
    //int[] nums = {1,7,3,6,5,6};
    int[] nums = {1,2,3};
    System.out.println(pivotIndex(nums));
  }

  public static int pivotIndex1(int[] nums) {

    int sumLeft =  nums[0];//1
    int sumRight = nums[nums.length - 1];//3

    for (int i = 0, j = nums.length - 1; i < nums.length;) {

      if (sumLeft > sumRight) {
        sumRight = sumRight + nums[--j];
      }else
        if(sumLeft < sumRight)
        {
          sumLeft=sumLeft+nums[++i];
        }
        if(sumLeft==sumRight){
          return i+1;
        }
    }
    return 0;
  }
  public static int pivotIndex(int[] nums) {
    int total = 0, sum = 0;
    for (int num : nums) total += num;//6
    for (int i = 0; i < nums.length; sum += nums[i++])//sum=2,5,
      if (sum * 2 == total - nums[i]) return i;//4,5,10,4
    return -1;
  }

}
