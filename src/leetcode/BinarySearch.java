package leetcode;

public class BinarySearch {

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6,7};
    System.out.println(search(arr, 1));
  }

  public static int search(int[] nums, int target) {

    int li = 0;
    int hi = nums.length-1;
    int mi = (li + hi) / 2;

    while (li <= hi) {
      if (target == nums[mi]) {
        return mi;
      } else if (target > nums[mi]) {
        li = mi + 1;
      } else {
        hi = mi - 1;
      }
      mi = (li + hi) / 2;
    }
    return -1;
  }
}
