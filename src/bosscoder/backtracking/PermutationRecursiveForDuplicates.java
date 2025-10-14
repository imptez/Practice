package bosscoder.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationRecursiveForDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> result= new ArrayList<>();
        generatePermutation(0,arr,result);
        result.forEach(System.out::println);
    }

    static void generatePermutation(int index,int[] arr,List<List<Integer>> result) {
        if (index == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int num : arr) {
                ds.add(num);
            }
            result.add(ds);
            return;
        }
        Set<Integer> used = new HashSet<>();
        for (int i = index; i < arr.length; i++) {
            if (used.contains(arr[i])) continue;

            used.add(arr[i]);
            swap(index, i, arr);
            generatePermutation(index + 1, arr, result);
            swap(index, i, arr);
        }
    }
        static void swap(int left, int right,int[] arr){
            int temp=arr[left];
            arr[right]=arr[left];
            arr[left]=temp;
        }
    }
