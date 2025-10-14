package bosscoder.sorting;

public class FirstLastPositionSortedArray {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] solve = solve(nums, target);
        System.out.println("Start"+solve[0]+" end"+solve[1]);
    }

    static int[] solve(int[] input, int target) {
        int[] c = new int[2];
        int start = -1;
        int end = -1;
        int ls = 0;
        int rs = input.length-1;
        int le = 0;
        int re = input.length-1;
        while (ls <= rs) {
            int mids = (ls + rs) / 2;
            if (input[mids] == target) {
                start =mids;
                rs = mids - 1;
            }
            else if (input[mids] < target) {
                ls = mids + 1;
            } else if (input[mids] > target){
                rs = mids - 1;
            }
        }

        while (le <= re) {
            int mids = (le + re) / 2;
            if (input[mids] == target) {
                end =mids;
                le = mids + 1;
            }
            else if (input[mids] < target) {
                le = mids + 1;
            } else if (input[mids] > target){
                re = mids - 1;
            }
        }
        c[0]=start;
        c[1]=end;
        return c;
    }
}
