package bosscoder.stack;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        for (int num : temperatures) System.out.print(num + ", ");
        System.out.println();
        int[] result = dailyTemperatures(temperatures);
        for (int num : result) System.out.print(num + ", ");
    }

    static int[] dailyTemperatures(int[] input) {
        int[] result = new int[input.length];
        Stack<Integer> tempStack = new Stack<>();
        for (int i = input.length - 1; i >= 0; i--) {
            while (!tempStack.isEmpty() && input[i] >= input[tempStack.peek()]) {
                tempStack.pop();
            }
            if (!tempStack.isEmpty()) {
                result[i] = tempStack.peek() - i;
            } else {
                result[i] = 0;
            }
            tempStack.push(i);
        }
        return result;
    }
}
