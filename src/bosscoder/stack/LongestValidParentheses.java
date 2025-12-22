package bosscoder.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public interface LongestValidParentheses {

    public static void main(String[] args) {
       String s = "(()";
       List<String> list=new ArrayList<>();
        System.out.println(getValidParentheses(s));
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
}
