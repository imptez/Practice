package bosscoder.sorting;

public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(find(nums));
    }

    static int find(int[] input) {
        int start = 0;//0
        int end = input.length - 1;//8
        while (start < end) {
            int mid = (start + end) / 2;//4,2

            if (mid % 2 == 1) mid = mid - 1;

            if (input[mid] == input[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }
        return input[start];
    }
}