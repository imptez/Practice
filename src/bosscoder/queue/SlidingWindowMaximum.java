package bosscoder.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    private static int[] maxSlidingWindow(int[] input, int k) {
        if (input.length == 0 || k <= 0) return null;

        int size = input.length;
        int[] result = new int[size - k + 1];
        Deque<Integer> dQue = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            //remove elements outside the window
            if(!dQue.isEmpty() && dQue.peekFirst()< i-k+1){
                dQue.pollFirst();
            }
            //remove smallest element from the dequeue
         while(!dQue.isEmpty() && input[dQue.peekLast()]< input[i]){
             dQue.pollLast();
         }
            // adding elements to the dequeue
            dQue.offerLast(i);

         //adding max in a window to result.
            if (!dQue.isEmpty() && i >= k - 1) {
                result[i - k + 1] = input[dQue.peekFirst()];
            }

        }
        return result;
    }

}
