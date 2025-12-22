package bosscoder.sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

   private static void mergeSort(int[] arr, int[] temp, int start, int end) {
        if (start == end) return;
        int mid = (start + end) / 2;
        mergeSort(arr,temp,start,mid);
        mergeSort(arr,temp,mid+1,end);
        mergeArray(arr,temp,start,mid,end);
    }

    private static void mergeArray(int[] arr, int[] temp, int start, int mid, int end) {
        int i=start,k=start;
        int j=mid+1;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)temp[k++]=arr[i++];
        while(j<=end)temp[k++]=arr[j++];
        for (i = start; i <= end; i++)
            arr[i] = temp[i];
    }


}
