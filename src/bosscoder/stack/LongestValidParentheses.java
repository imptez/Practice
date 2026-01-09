package bosscoder.stack;

import java.util.Stack;

public interface LongestValidParentheses {

    static void main(String[] args) {
       String s = "(()";
        System.out.println(longestValidBracket(s));
    }

    static int getValidParentheses(String str){

        Stack<Character> st = new Stack<>();
        int counter=0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            boolean isValid=false;
            if(ch==')'){
                while(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                    isValid=true;
                }
            }
            if(isValid){
                counter+=2;
            }
            st.push(ch);
        }
        return counter;
    }

    static int longestValidBracket(String str){
        Stack<Character> st= new Stack<>();
        int c=0;
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            boolean isValid=false;
            if(ch==')') {
                while (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                    isValid = true;
                }
            }
                if(isValid){
                    c+=2;
                }
            st.push(ch);
        }
        return c;
    }
}
