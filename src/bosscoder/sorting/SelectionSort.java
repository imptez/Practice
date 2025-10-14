package bosscoder.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(arr);

        selectionSortDescending(arr);

        System.out.println("\nSorted array in descending order:");
        printArray(arr);
    }

    static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Assume the maximum is the first element in unsorted part
            int maxIndex = i;

            // Find the index of the maximum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the first element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;

            // Debug: show the array after each outer loop iteration
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
