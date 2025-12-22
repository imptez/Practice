package bosscoder.bits;

public class Test {
    public static void main(String[] args) {
        System.out.println("Using OR gate "+getOddOrEvenWithOr(11));
        System.out.println("Using AND gate "+getOddOrEvenWithOr(11));
        System.out.println("Using OR gate "+getOddOrEvenWithOr(10));
        System.out.println("Using AND gate "+getOddOrEvenWithOr(10));
    }

    static String getOddOrEvenWithOr(int input){
        int num=input;
        input |=1;
        if(input==num){
            return "ODD";
        }
        return "EVEN";
    }

    static String getOddOrEvenWithAnd(int input){
        input &=1;
        if(input==1){
            return "ODD";
        }
        return "EVEN";
    }


}
