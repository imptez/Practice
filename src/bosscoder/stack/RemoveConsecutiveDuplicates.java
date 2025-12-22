package bosscoder.stack;

import java.util.Stack;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("acbllbck"));
    }

    static String removeDuplicates(String str) {
        Stack<Character> charStack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == ch) {
                charStack.pop();
            } else {
                charStack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char newCh : charStack) {
            sb.append(newCh);
        }
        return sb.toString();
    }
}
