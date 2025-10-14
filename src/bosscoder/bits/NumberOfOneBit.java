package bosscoder.bits;

public class NumberOfOneBit {

    public static void main(String[] args) {
        String n = "00000000000000000000000000001011";
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(String s){
        int n= Integer.parseUnsignedInt(s,2);
        int ans=0;
        while(n!=0){
            ans+=(n & 1);
            n>>>=1;
        }
        return ans;
    }
}
