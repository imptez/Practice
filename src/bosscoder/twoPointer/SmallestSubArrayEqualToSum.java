package bosscoder.twoPointer;

public class SmallestSubArrayEqualToSum {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int k = 7;
        System.out.println(getTheSize(arr, k));
    }

    static int getTheSize(int[] arr, int k) {
        int ws = 0;
        int wSum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int we = 0; we < arr.length; we++) {

            wSum += arr[we];
            while (wSum >= k) {
                minLen = Math.min(minLen, we - ws + 1);
                wSum -= arr[ws];
                ws++;
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }
}
