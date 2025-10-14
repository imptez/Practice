package bosscoder.maths;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numberOfGoodPairs(int[] nums) {
        int n = nums.length;
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    static int numIdenticalPairs(int[] nums) {
        int gp=0;
        int f[]=new int[101];
        for(int i:nums){
            gp+=f[i];
            f[i]++;
        }
        return gp;
    }
}
