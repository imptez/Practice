package bosscoder.bits;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(uint32ToSolve("11111111111111111111111111111101"));
    }

    static long uint32ToSolve(String s) {
        long n = Long.parseLong(s, 2);
        long result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;        // Make room
            result |= (n & 1);   // Add last bit of n
            n >>>= 1;            // Shift right (unsigned)
        }
        return result;
    }
}
