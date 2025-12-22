package bosscoder.stack;

import java.util.Stack;

public class MinStack {
        int minEle;
        Stack<Integer> s = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        /*returns min element from stack*/
        int getMin() {
            return minEle = minStack.peek();
        }

        /*returns popped element from stack*/
        int pop() {
            int temp = s.pop();
            if (temp == minStack.peek()) {
                minStack.pop();
            }
            return temp;
        }

        /*push element x into the stack*/
        void push(int x) {
            s.push(x);
            if (minStack.isEmpty() || x < minStack.peek()) {
                minStack.push(x);
            }
        }
    }
