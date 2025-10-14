package bosscoder.bits;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 4, 2};
        System.out.println(find(nums));
    }

    static int find(int[]  input){
      int result=0;
      for(int num:input){
          System.out.println("Before "+result);
          result ^=num;
          System.out.println("After "+result);
      }
      return result;
    }
}
