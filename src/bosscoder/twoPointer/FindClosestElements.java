package bosscoder.twoPointer;

import java.util.Arrays;

public class FindClosestElements {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 4, x = -1;
        int[] result=getElements(arr,k,x);
        for(int num:result){
            System.out.println(num +" , " );
        }
    }

    static int[] getElements(int[] input, int k, int x){
        int a=0;
        int b=input.length-1;

        while(b-a+1>k){
            if (Math.abs(input[b] - x) < Math.abs(input[a] - x)) {
                a++;
            } else {
                b--;
            }
        }
        return Arrays.copyOfRange(input,a,b+1);
    }
}
