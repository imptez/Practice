package bosscoder.arrays;

public class ClosestSumOrSingle {

    /**
     * Finds the element or consecutive pair whose value/sum
     * is closest to the target.
     *
     * INPUT:
     * arr = {1, 3, 4, 6, 8, 9, 14}
     * target1 = 15
     * target2 = 10
     *
     * OUTPUT:
     * Closest to 15: 14
     * Closest to 10: 4 6
     */

    public static int[] findClosest(int[] arr, int target) {

        if(arr.length==0) return new int[0];
        int closestSum= Math.abs(target-arr[0]);
        int[] result = new int[0];
        // Single number closest
        for(int num:arr){
        int diff= Math.abs(target-num);
        if(diff<closestSum){
            closestSum=diff;
            result=new int[]{num};
        }
        }

        //consuctive pair sum nearest to target
        for(int i=0;i<arr.length-1;i++){
            int sum=arr[i]+arr[i+1];
            int diff=Math.abs(target-sum);
            if(diff<closestSum){
                closestSum=diff;
                result=new int[]{arr[i],arr[i+1]};
            }
        }
        return result;
    }






    public static int[] findClosest1(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] result = new int[]{arr[0]};
        int closestDiff = Math.abs(target - arr[0]);

        // check single numbers
        for (int num : arr) {
            int diff = Math.abs(target - num);
            if (diff < closestDiff) {
                closestDiff = diff;
                result = new int[]{num};
            }
        }

        // check consecutive pairs
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            int diff = Math.abs(target - sum);

            if (diff < closestDiff) {
                closestDiff = diff;
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
