package datastructures.strider;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(getValue(n));
    }

    private static int getValue(int n) {
        if(n==1 || n==2){
            return 1;
        }else {
            int k=0, j=1;
            int sum =0;
            for(int i=1;i<n;i++){
              sum= k+j ;
              k=j;
              j=sum;
            }
            return sum;
        }
    }

//1,1,2,3,
}
