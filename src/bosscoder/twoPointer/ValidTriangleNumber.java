package bosscoder.twoPointer;

public class ValidTriangleNumber {

    public static void main(String[] args) {

        int[] nums = {4,2,3,4};
        System.out.println(triangleNumber(nums));
    }

    static int triangleNumber(int[] input) {
        sort(input);
        int n=input.length-1;
        int count=0;
        for(int k=n;k>=2;k--){
            int i=0,j=k-1;
            while(j>i){
                if(input[i]+input[j]>input[k]){
                    count+=j-i;
                    j--;
                }else{
                    i++;
                }
            }
        }
        return count;
    }

    static void sort(int[] arr){

        int n=arr.length;
        boolean swap=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
