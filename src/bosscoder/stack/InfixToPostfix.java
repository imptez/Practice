package bosscoder.stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "A+B*(C/D-E)";
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + infixToPostfix(infix));
    }

    static String infixToPostfix(String input) {
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {
                    result.append(st.pop());
                }
                st.push(ch);
            }

        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.toString();
    }

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 3;
            case '^':
                return 4;
        }
        return -1;
    }
}
