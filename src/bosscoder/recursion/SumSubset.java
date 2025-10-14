package bosscoder.recursion;

import java.util.ArrayList;
import java.util.List;

public class SumSubset {

    public static void main(String[] args) {
        int[] arr= {1,2,1};
        int k=2;
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        findSumOfSubSequence(0,arr,curr,0,k,result);
        result.forEach(System.out::println);
    }

    private static void findSumOfSubSequence(int index, int[] arr, List<Integer> curr, int currSum, int sum, List<List<Integer>> result) {
        if(index==arr.length){
            if(currSum==sum){
                result.add(new ArrayList<>(curr));
            }
            return;
        }

        curr.add(arr[index]);
        findSumOfSubSequence(index+1,arr,curr,currSum+arr[index],sum,result);
        curr.remove(curr.size()-1);
        findSumOfSubSequence(index+1,arr,curr,currSum,sum,result);
    }
}
