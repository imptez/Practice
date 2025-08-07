package sapient;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7,10,12,13};
        int[] arr2 = {2, 4, 6, 15,21,28,35,17};

        int[] merged = mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(merged));
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int arr1Size = arr1.length;//4
        int arr2Size = arr2.length;//4
        int[] merge = new int[arr1Size + arr2Size];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1Size && j < arr2Size) {// i=2,j=1
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];//1,2,3
            } else {
                merge[k++] = arr2[j++];//1,2
            }
        }
        while (i < arr1Size) {
            merge[k++] = arr1[i++];
        }
        while (j < arr2Size) {
            merge[k++] = arr2[j++];
        }
        return merge;
    }
}
