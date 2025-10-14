package bosscoder.bits;

public class SingleNumberII {
    public static void main(String[] args) {
        int nums[]={4, 2 , 2 ,2};
        System.out.println(find(nums));
    }

    static int solve(int[] nums){
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

    static int find(int[]  input){
        int output=0;
        for(int num:input){
            output=(output ^ num) &num;
        }
        return output;
    }
}
