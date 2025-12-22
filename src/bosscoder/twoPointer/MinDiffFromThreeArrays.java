package bosscoder.twoPointer;

public class MinDiffFromThreeArrays {
    public static void main(String[] args) {
        int[] A = { 1, 4, 5, 8, 10 };
        int[] B = {6, 9, 15 };
        int[] C = {2, 3, 6, 6 } ;
        System.out.println(minDiffFromThreeArrays(A,B,C));
    }

    static int minDiffFromThreeArrays(int[] input1,int[] input2,int[] input3){
        int i=0,j=0,k=0;
        int minDifference=Integer.MAX_VALUE;

        while(i<input1.length && j< input2.length && k<input3.length){
            int minValue=Math.min(input1[i],Math.min(input2[j],input3[k]));
            int maxValue=Math.max(input1[i],Math.max(input2[j],input3[k]));
            int diff=maxValue-minValue;

            minDifference=Math.min(minDifference,diff);

            if(minValue==input1[i]) i++;
            if(minValue==input2[j]) j++;
            if(minValue==input3[k]) k++;
        }
        return minDifference;
    }
}
