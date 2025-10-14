package bosscoder.sorting;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};int target = 0;
        System.out.println(find(nums,target));
    }

    static int find(int[] input,int target) {
        int start = 0;
        int end = input.length-1;//6
        int pivot = 0;
        while (start <= end) {
            int mid = (start + end) / 2;//3,5,4
            if (input[mid] < input[0]) {
                pivot = mid;//5,4
                end = mid - 1;//4,3
            } else {
                start = mid + 1;//4
            }
        }
        if(input[0]>target){
            return search(input,target,pivot,input.length-1);
        }else{
            return search(input,target,0,pivot-1);
        }
    }
    static int search(int[] input,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(input[mid]==target){
                return mid;
            }else if(input[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
