package bosscoder.maths;

public class CountOfMatches {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }

    static int numberOfMatches(int n) {
        int sumMatches = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                sumMatches += n / 2;
                n/=2;
            } else {
                sumMatches += (n - 1) / 2;
                n=n/2+1;
            }
        }
        return sumMatches;
    }
}
