package bosscoder.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {
       String[] tokens = {"5","8","9","3","/","2","-","*","+"};
        System.out.println(evaluate(tokens));
    }

    static int evaluate(String[]  input){
        List<String> operator= Arrays.asList("+", "-", "*", "/");
        Stack<Integer> numbers=new Stack<>();
        for(int i=0;i<input.length;i++ ){
            String val=input[i];
            if(operator.contains(val)){
                 int b= numbers.pop();
                 int a= numbers.pop();
                 numbers.push(calculate(a,b,val));
            }else{
                numbers.push(Integer.parseInt(val));
            }
        }
        if(!numbers.isEmpty()){
            return numbers.pop();
        }else{
            return 0;
        }
    }

    static Integer calculate(int a, int b, String val) {
        return switch (val) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}
