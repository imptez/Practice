package bosscoder.sorting;

public class FindPeakElement {

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int[] nums1={1,2,3,1};
        System.out.println(find(nums));
    }

    static int find(int[] input){
        int n= input.length;
        if(input[0]>input[1]) return 0;
        if(input[n-1]>input[n-2]) return 0;
        int l=1;
        int r=n-2;//2
        while(l<=r){
            int mid=(l+r)/2;//1
            if(input[mid]>input[mid+1] && input[mid]>input[mid-1]){
                return mid;
            }else if(input[mid]<input[mid-1]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}
