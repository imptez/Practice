package bosscoder.stack;

import java.util.Stack;

public class ExpressionReduntantBracket {
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(isRedundant(str));
    }

    static boolean isRedundant(String input) {

        Stack<Character> st = new Stack<>();

        for (Character ch : input.toCharArray()) {
            if (ch == ')') {
                boolean hasOperator = false;
                while (!st.isEmpty() && st.peek() != '(') {
                    char top = st.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
                if (!hasOperator) {
                    return true;
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}
