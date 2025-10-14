package bosscoder.arrays;

import java.util.Arrays;
import java.util.List;

public class SumOfAllSubmatrices {
    public static void main(String[] args) {
      List<List<Integer>> input= Arrays.asList(Arrays.asList(1,1),
              Arrays.asList(1,1));
        System.out.println(findSum(input));
    }

    static int findSum(List<List<Integer>>  input){
        int n= input.size();
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int tl=(i+1)*(j+1);
                int br=(n-i)*(n-j);
                int totalSubMatrix=tl*br;
                sum+=totalSubMatrix * input.get(i).get(j);
            }
        }
        return sum;
    }
}
