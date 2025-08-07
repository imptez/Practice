package bosscoder.maths;

import java.util.Set;
import java.util.TreeSet;

public class FourDivisors {

    public static void main(String[] args) {
        int[] nums={21,4,7};
        int[] nums1={21,21};
        int[] nums2={1,2,3,4,5};
        System.out.println(sumFourDivisors(nums2));
    }

    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            Set<Integer> divisors = new TreeSet<>();
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    divisors.add(num / i);
                }
            }
            if (divisors.size() == 4) {
                sum += divisors.stream().mapToInt(Integer::intValue).sum();
            }
        }
        return sum;
    }
}
