package bosscoder.arrays;

import java.util.Arrays;

public class MaximumGap {

    //Pegion Hole Theory
    public static void main(String[] args) {

        int arr[] = {1, 4, 5, 7, 2, 13, 27, 29};
        System.out.println(solve(arr));
    }

    static int solve(int[] input) {

        int n = input.length;
        int maxGap = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : input) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        //bucket Size
        int bucketSize = (int) Math.ceil((double) ((max - min) / (n - 1)));
        int[] minBucket = new int[n - 1];
        int[] maxBucket = new int[n - 1];

        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        //bucketIndex= Input[i]-min/bucketSize


        for (int j : input) {
            if (j == max || j == min) continue;

            int bucketIndex = (j - min) / bucketSize;

            maxBucket[bucketIndex] = Math.max(j, maxBucket[bucketIndex]);
            minBucket[bucketIndex] = Math.min(j, minBucket[bucketIndex]);
        }

        for (int i = 0; i < n - 1; i++) {
            if (minBucket[i] == Integer.MAX_VALUE) continue;
            maxGap = Math.max(minBucket[i] - min, maxGap);
            min = maxBucket[i];
        }
        maxGap = Math.max(maxGap, max - min);
        return maxGap;
    }

    static int solveNew(int[] nums){
        int n = nums.length;
        int maxGap = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        int bucketSize = (int) Math.ceil((double) (max - min) / (n - 1));
        int[] maxBucketArray = new int[n - 1];
        int[] minBucketArray = new int[n - 1];

        Arrays.fill(maxBucketArray, Integer.MIN_VALUE);
        Arrays.fill(minBucketArray, Integer.MAX_VALUE);
        for (int j : nums) {
            if (j == min || j == max)
                continue;
            int bucketIndex = (j - min) / bucketSize;
            maxBucketArray[bucketIndex] = Math.max(j, maxBucketArray[bucketIndex]);
            minBucketArray[bucketIndex] = Math.min(j, minBucketArray[bucketIndex]);
        }

        for (int i = 0; i < n - 1; i++) {
            if (minBucketArray[i] == Integer.MAX_VALUE)
                continue;
            maxGap = Math.max(minBucketArray[i] - min, maxGap);
            min = maxBucketArray[i];
        }
        maxGap=Math.max(maxGap,max-min);
        return maxGap;
    }

}
