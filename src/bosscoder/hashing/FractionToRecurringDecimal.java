package bosscoder.hashing;

import java.util.HashMap;

public class FractionToRecurringDecimal {
    public static void main(String[] args) {
        // Test cases
        System.out.println(fractionToDecimal(1, 2));   // Output: "0.5"
        System.out.println(fractionToDecimal(2, 3));   // Output: "0.(6)"
        System.out.println(fractionToDecimal(4, 333)); // Output: "0.(012)"
        System.out.println(fractionToDecimal(1, 5));   // Output: "0.2"
        System.out.println(fractionToDecimal(22, 7));  // Output: "3.(142857)"
    }

    private static String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) return "Invalid (Division by zero)";
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        // Handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        long integral = num / denominator;
        result.append(integral);
        long rem = num % denominator;
        if (rem == 0) {
            return result.toString();
        }
        result.append(".");
        HashMap<Long, Integer> hm = new HashMap<>();
        while (rem != 0) {
            if (hm.containsKey(rem)) {
                int startIndex = hm.get(rem);
                result.insert(startIndex, "(");
                result.append(")");
                break;
            }
            hm.put(rem, result.length());
            rem *= 10;
            long quotient = rem / denominator;
            result.append(quotient);
            rem %= denominator;
        }
        return result.toString();
    }
}
