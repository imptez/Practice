package bosscoder.sorting;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        bubbleSortDescending(nums);
        for(int num:nums){
            System.out.print(num+" , ");
        }
    }

    static void bubbleSort(int[] input){
        int n=input.length;
        boolean swap=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(input[j]>input[j+1]){
                    int temp=input[j+1];
                    input[j+1]=input[j];
                    input[j]=temp;
                }
            }
            if(!swap) break;
        }
        for(int num:input){
            System.out.print(num+" ,");
        }
    }

    static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swap = false;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
}
