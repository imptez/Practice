package bosscoder.arrays;

public class RearrangeAlternatingPositiveNegativeItems {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, -1, 4};
        int newArr[] = sort(arr);
        for (int j : newArr) {
            System.out.println(j);
        }
    }

    static int[] sort(int[] input) {
        int[] newArr = new int[input.length];
        int[] pos = new int[input.length];
        int[] neg = new int[input.length];
        int posCount = 0;
        int negCount = 0;

        for (int i : input) {
            if (i > 0) {
                pos[posCount++] = i;
            } else {
                neg[negCount++] = i;
            }
        }
        boolean posTurn = input[0] >= 0;
        int count = 0, p = 0, n = 0;

        while (p < posCount && n < negCount) {
            if (posTurn) {
                newArr[count++] = pos[p++];
            } else {
                newArr[count++] = neg[n++];
            }
            posTurn = !posTurn;
        }

        while (n < negCount) {
            newArr[count++] = neg[n++];
        }

        while (p < posCount) {
            newArr[count++] = pos[p++];
        }

        return newArr;
    }

}
