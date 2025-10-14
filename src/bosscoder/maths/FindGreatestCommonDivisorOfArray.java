package bosscoder.maths;

public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 9, 10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {

        int min = Integer.MAX_VALUE;//4
        int max = Integer.MIN_VALUE;//10

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        //HCF LOGIC
        while (min != 0) {
            int temp = min;//4,2
            min = max % min;//10%4=2,4%2
            max = temp;//4,2
        }
        return max;


    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
