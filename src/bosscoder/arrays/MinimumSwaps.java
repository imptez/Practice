package bosscoder.arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 5, 8, 7, 4}, k = 5;
        System.out.println(solveOptimize(arr, k));
    }

    static int solve(int[] input, int k) {
        int newArr[] = new int[input.length];
        int j = 0;
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] <= k) {
                newArr[j++] = input[i];
            } else {
                int temp = input[i];
                for (int s = i + 1; s < input.length; s++) {
                    if (input[s] <= k) {
                        newArr[i] = input[s];
                        input[s] = temp;
                        count++;
                        break;
                    }
                }
            }

        }
        return count;
    }

    static int solveOptimize(int[] input, int k) {
        int count = 0;// the count which are less that or equal to K
        for (int s : input) {
            if (s <= k) count++;
        }
        // find the bad count
        int bad = 0;
        for (int l = 0; l < count; l++) {
            if (input[l] > k) bad++;
        }

        int ans = bad;
        for (int i = 0, j = count; j < input.length; i++, j++) {
            if (input[i] > k) {
                bad--;
            }
            if (input[j] > k) {
                bad++;
            }
            ans = Math.min(ans, bad);
        }
        return ans;
    }
}
