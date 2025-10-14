package bosscoder.maths;

public class PairDivisibleByK {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6};
        int[] arr={-1,1,-2,2,-3,3,-4,4};
        int k = 10;
        System.out.println(canArrangeOptimized(arr, k));
    }

    static boolean canArrangeOptimized(int[] arr, int k) {
        int[] remainderCount = new int[k];
        for(int num: arr){
            int rem = num % k;
            if(rem < 0){
                rem = rem + k;
            }
            remainderCount[rem]++;
        }
        if (remainderCount[0] % 2 != 0) return false;

        for(int i = 1;i <= k / 2;i++){
            if(i==k-i){
                if(remainderCount[i]%2 !=0) return false;
            }else{
                if(remainderCount[i] != remainderCount[k-i]) return false;
            }
        }
        return true;
    }
}
