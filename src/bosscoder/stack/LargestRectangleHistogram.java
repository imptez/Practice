package bosscoder.stack;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 2, 4};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights)); // Output: 10
    }

    static int largestRectangleArea(int[] input) {
        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        int n = input.length;
        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : input[i];
            while (!st.isEmpty() && currHeight < input[st.peek()]) {
                int height = input[st.pop()];
                int width;
                if (st.isEmpty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}
