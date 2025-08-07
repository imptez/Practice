package sapient;

public class LongestUniformSequence {
    public static void main(String[] args) {
        String input = "aaabbccccdaa";
        Result result = findLongestUniformSubsequence(input);
        System.out.println("Character: " + result.character);
        System.out.println("Length: " + result.length);
    }

    private static Result findLongestUniformSubsequence(String s) {
        if (s == null || s.isEmpty()) return new Result('\0', 0);
        char maxChar = s.charAt(0);
        int maxLength = 1;

        char currentChar = s.charAt(0);
        int currentLength = 1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == currentChar){
                currentLength++;
            }else {
                currentChar = s.charAt(i);
                currentLength = 1;
            }
            if(currentLength>maxLength){
                maxLength=currentLength;
                maxChar=currentChar;
            }
        }
        return new Result(maxChar,maxLength);

    }

    static class Result {
        char character;
        int length;

        Result(char character, int length) {
            this.character = character;
            this.length = length;
        }
    }
}
