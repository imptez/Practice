package bosscoder.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Unsorted array:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int n : arr) System.out.print(n + " ");
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = partion(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    static int partion(int[] arr, int start, int end) {
        int pe = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pe) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
