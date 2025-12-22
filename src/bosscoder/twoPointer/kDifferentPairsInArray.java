package bosscoder.twoPointer;

public class kDifferentPairsInArray {

    /**
     * Input: nums = [3,1,4,1,5], k = 2
     * Output: 2
     * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
     * Although we have two 1s in the input, we should only return the number of unique pairs.
     */

    public static void main(String[] args) {
        int[] input={1,2,3,4,5};
        int k=1;
        System.out.println(getPair(input,k));
    }

    static int getPair(int[] input, int k) {

        sortArray(input);
        int n = input.length;
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < n) {
            if (i == j || j - i < k) j++;
            else if (j - i > k) i++;
            else {
                count++;
                i++;
                j++;
                while (i < n && input[i] == input[i - 1]) i++;
                if (j <= i && i < n) j = i + 1;
            }

        }
        return count;
    }

    static void sortArray(int[] arr) {
        int n = arr.length;
        boolean swap = false;

        for (int i = 0; i < n; i++) {//3,1,4,1,5 n=5
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

    }
}
