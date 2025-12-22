package bosscoder.sorting;

public class ReversePair {

    public static void main(String[] args) {
        int[] input = {2, 4, 3, 5, 1};
        int temp[] = new int[input.length];
        System.out.println(mergeSort(input, temp, 0, input.length - 1));
    }

    static int mergeSort(int[] input, int[] temp, int start, int end) {
        int count = 0;
        if (start == end) return count;
        int mid = (start + end) / 2;
        count += mergeSort(input, temp, start, mid);
        count += mergeSort(input, temp, mid + 1, end);
        count += countPairs(input, start, mid, end);
        merge(input, temp, start, mid, end);
        return count;
    }

    static int countPairs(int[] input, int start, int mid, int end) {
        int count = 0;
        int j = mid + 1;

        for (int i = start; i <= mid; i++) {
            while (j <= end && input[i] > 2 * input[j]) {
                j++;
            }
            count += j - (mid + 1);
        }
        return count;


        
    }

    static void merge(int[] nums, int[] temp, int start, int mid, int end) {
        int i = start, j = mid + 1, k = start;

        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= end) temp[k++] = nums[j++];

        for (i = start; i <= end; i++) {
            nums[i] = temp[i];
        }
    }
}
