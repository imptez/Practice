package bosscoder.maths;

public class PermutationSequence {

    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = 10 * sum + i;
        }
        System.out.println(sum);
      //  System.out.println(getSequenceNumber(3));
    }

    static int getSequenceNumber(int n, int k, int count, int num) {
        if (count == k) {
            return num;
        }
        num = 10 * num;
        return 0;
    }

}
