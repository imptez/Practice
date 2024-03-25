package Leetcode2;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {

        String com1 = str1 + str2;
        String com2 = str2 + str1;
        if (com1.equals(com2)) {
            int gcd = gcd(str1.length(), str2.length());
            return com1.substring(0,gcd);
        } else {
            return "";
        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
