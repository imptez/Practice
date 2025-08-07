package datastructures.strider;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=420;
        System.out.println(reverseNumberOriginal(n));
        System.out.println(reverseNumber(n));
        System.out.println(reverseNumberRecussive(n,0));
    }

    private static int reverseNumber(int n) {
        int newNum=0;
        while(n>0){
            int mod= n%10;
            newNum=newNum*10+mod;
            n=n/10;
        }
        return newNum;
    }
    private static String reverseNumberOriginal(int n) {
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int mod= n%10;
            sb.append(mod);
            n=n/10;
        }

        return String.valueOf(sb);
    }



    private static int reverseNumberRecussive(int n,int num){
        if(n==0){
            return num;
        }
        int mod=n%10;
        num=num*10+mod;
        n=n/10;
        return reverseNumberRecussive(n,num);
    }
}
