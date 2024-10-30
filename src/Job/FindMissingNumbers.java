package Job;

import java.util.Arrays;

public class FindMissingNumbers {

    public static void findMissingNumbers(int[] arr) {
        Arrays.sort(arr);

        int missingCount = 0;
        int[] missingNumbers = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1] - 1) {
                missingNumbers[missingCount] = arr[i] + 1;
                missingCount++;
            }
            if (missingCount == 2)
                break;
        }

        if (missingCount < 2) {
            if (arr[0] != 1)
                missingNumbers[missingCount++] = 1;
            if (arr[arr.length - 1] != arr.length + 1)
                missingNumbers[missingCount] = arr[arr.length - 1] + 1;
        }

        System.out.println("The missing continuous numbers are: " + missingNumbers[0] + " and " + missingNumbers[1]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 9, 10};
        findMissingNumbers(arr);
        int[] arr2 = {1, 2, 3, 5,6, 7, 8, 9, 10};
        findMissingNumber(arr2);
    }

    private static void findMissingNumber(int[] arr2) {
        int n=arr2.length +1;
        int expectedSum=n*(n+1)/2;
        System.out.println("Expected Sum "+expectedSum);
        int actualSum=0;
        for(int i:arr2){
            actualSum= actualSum+i;
        }
        System.out.println("The actual Sum "+actualSum);
        System.out.println("The number missing is "+ (expectedSum-actualSum));
    }


}

