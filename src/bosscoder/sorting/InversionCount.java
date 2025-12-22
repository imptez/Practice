package bosscoder.sorting;

/**
 * Given an array a[]. The task is to find the inversion count of a[].
 * Where two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 */
public class InversionCount {
    public static void main(String[] args) {
        int[] input = {8, 4, 2, 1};
        int[] temp = new int[input.length];
        System.out.println(mergeSort(input, temp, 0, input.length - 1));
        for(int num:input){
            System.out.print(num+" , ");
        }
    }

    static int mergeSort(int[] input, int[] temp, int start, int end) {
        int count = 0;
        if (start == end) return count;
        int mid = (end + start) / 2;
        count += mergeSort(input, temp, start, mid);
        count += mergeSort(input, temp, mid + 1, end);
        count += merge(input, temp, start, mid, end);
        return count;
    }

    static int merge(int[] input, int[] temp, int start, int mid, int end) {
        int i = start;
        int k = start;
        int j = mid + 1;
        int count = 0;
        while (i <= mid && j <= end) {
            if (input[i] <= input[j]) {
                temp[k++] = input[i++];
            } else {
                temp[k++] = input[j++];
                count += (mid - i + 1);
            }
        }
        while (i <= mid) temp[k++] = input[i++];
        while (j <= end) temp[k++] = input[j++];

        for (i = start; i <= end; i++) {
            input[i] = temp[i];
        }
        return count;
    }
}
