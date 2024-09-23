package design_pattern.com.company.hashmap;

public class Practice {

    private static final int MAXIMUM_CAPACITY= 1<<30;

    public static void main(String[] args) {
        System.out.println(tableSizeFor(5));
    }
    static final int tableSizeFor(int cap) {
        System.out.println(-1>>>30);
        int n = -1 >>> Integer.numberOfLeadingZeros(cap - 1);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;

    }
}
