package bosscoder.sorting;

public class MinimumBottleVisible {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5, 5, 4};
        System.out.println(minimumBottle(arr));
    }

    static int minimumBottle(int[]  input){
        int n= input.length;
        int[] temp=new int[n];
        callSort(input,temp,0,n-1);
        int maxFreq=1;
        int count=1;

        for(int i=1;i<input.length;i++){
            if(input[i]==input[i-1]){
                count++;
            }else{
                maxFreq=Math.max(maxFreq,count);
                count=1;
            }
        }
        maxFreq=Math.max(maxFreq,count);
        return maxFreq;
    }

    static void callSort(int[] input,int[] temp,int start,int end){
        if(start== end) return;
        int mid=(start+end)/2;
        callSort(input,temp,start,mid);
        callSort(input,temp,mid+1,end);
        callMerge(input,temp,start,mid,end);
    }

    static void callMerge(int[] input,int[] temp,int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int k=start;

        while(i<=mid && j<=end){
            if(input[i]<input[j]){
                temp[k++]=input[i++];
            }else{
                temp[k++]=input[j++];
            }
        }
        while(i<=mid ) temp[k++]=input[i++];
        while(j<=end ) temp[k++]=input[j++];

        for(i=start;i<=end;i++){
            input[i]=temp[i];
        }

    }
}
