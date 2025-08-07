package datastructures.strider;



public class CountDigits {
    public static void main(String[] args) {
     int n=85236974;
        int count=getCount(n);
        System.out.println("the count is "+getCountRecurrsive(n,0));
    }

    private static int getCount(int n) {
        int count=0;
        int value=n;
        if(n==0)
        {
            return 1;
        }
        while(value>0){
        value=value/10 ;
        count++;
        }
        return count;
    }

    private static int getCountRecurrsive(int n,int count){
        if(n==0){
            return count;
        }
        count=count+1;
        return getCountRecurrsive(n/10,count);
    }

}
