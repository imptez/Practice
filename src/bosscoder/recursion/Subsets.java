package bosscoder.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        List<Integer>curr = new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        generateSubset(0,nums,curr,result);
        result.forEach(System.out::println);
    }

    static void generateSubset(int index, int[]  input, List<Integer>curr,List<List<Integer>>result){
        if(index==input.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(input[index]);
        generateSubset(index+1,input,curr,result);
        curr.remove(curr.size()-1);
        generateSubset(index+1,input,curr,result);
    }


}
