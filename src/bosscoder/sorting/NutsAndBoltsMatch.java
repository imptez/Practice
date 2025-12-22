package bosscoder.sorting;

public class NutsAndBoltsMatch {

    public static void main(String[] args) {
        // Nuts and bolts are represented as array of characters
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};

        // Method based on quick sort which matches nuts and bolts
        quickSort(nuts, bolts, 0, 5);

        System.out.println("Matched nuts and bolts are : ");
        printArray(nuts);
        printArray(bolts);
    }

    // Method to print the array
    private static void printArray(char[] arr) {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.print("\n");
    }


    static void quickSort(char[] nuts, char[] bolts, int start, int end) {
        if (start >= end) return;
        int pivot = partitionBolt(nuts, start, end, bolts[end]);

        partitionBolt(bolts, start, end, nuts[pivot]);
        quickSort(nuts, bolts, start, pivot - 1);
        quickSort(nuts, bolts, pivot + 1, end);
    }

    private static int partitionBolt(char[] arr, int start, int end, char pivot) {
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            } else if (arr[j] == pivot) {
                swap(arr, j, end);
                j--;
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
