package bosscoder.arrays;

public class ClosestSumOrSingle {

    public static int[] findClosest(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return new int[0]; // no solution
        }

        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[2]; // will store pair or single

        // check single numbers
        for (int num : arr) {
            int diff = Math.abs(target - num);
            if (diff < Math.abs(target - closestSum)) {
                closestSum = num;
                result = new int[]{num};
            }
        }

        // check consecutive pairs
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            int diff = Math.abs(target - sum);

            if (diff < Math.abs(target - closestSum)) {
                closestSum = sum;
                result = new int[]{arr[i], arr[i + 1]};
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 9, 14};
        int target1 = 15;
        int target2 = 10;

        int[] pair1 = findClosest(arr, target1);
        System.out.print("Closest to " + target1 + ": ");
        for (int val : pair1) System.out.print(val + " ");
        System.out.println();

        int[] pair2 = findClosest(arr, target2);
        System.out.print("Closest to " + target2 + ": ");
        for (int val : pair2) System.out.print(val + " ");
    }
}


