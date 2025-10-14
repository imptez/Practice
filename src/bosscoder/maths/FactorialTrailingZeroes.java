package bosscoder.maths;

public class FactorialTrailingZeroes {

    public static void main(String[] args) {
        int n = getFactorial(10);
        System.out.println(n);
        int count = 0;
        while (n > 0) {
            if (n % 10 == 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("trailingZeros " + count);
        System.out.println("trailingZeros " + getTrailingZeros(10));
    }

    static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

    static int getTrailingZeros(int n){
        int count = 0;
        while(n>0){
            n/=5;
            count+=n;
        }
        return count;
    }
}
