package bosscoder.sorting;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(arr);

        bubbleSortDescending(arr);

        System.out.println("\nSorted array in descending order:");
        printArray(arr);
    }

    static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swap = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
            System.out.print("After iteration " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
