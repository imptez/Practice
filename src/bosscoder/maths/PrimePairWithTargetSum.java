package bosscoder.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimePairWithTargetSum {
    public static void main(String[] args) {

        int n=20;
        getPair(n).forEach(System.out::println);
    }

    static List<List<Integer>> getPair(int n){
        List<List<Integer>> result=new ArrayList<>();
        List<Boolean> isPrime=getPrime(n);
        for(int i=2;i<n/2;i++){
            if(isPrime.get(i) && isPrime.get(n-i)){
               result.add(Arrays.asList(i,n-i));
            }
        }
        return result;
    }

    static List<Boolean> getPrime(int n){
        List<Boolean> isPrime=new ArrayList<>(Collections.nCopies(n+1, true));
        isPrime.set(0,false);
        isPrime.set(1,false);
        for(int i=2;i<=n;i++){
            if(isPrime.get(i)){
              for(int j=2*i;j<n;j+=i){
                  isPrime.set(j,false);
              }
            }
        }
        return isPrime;
    }
}
