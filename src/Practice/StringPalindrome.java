package Practice;

public class StringPalindrome {
    public static void main(String[] args) {
        isPalindrome("abba");
        isPalindrome("abbccbba");
        isPalindrome("geeks");
    }

    private static void isPalindrome(String str) {
        if (str.equalsIgnoreCase(reverseString(str))){
            System.out.println("The given String %s is palindrome "+str);
        }else{
            System.out.println("The given String %s is not palindrome "+str);
        }

    }

    private static String reverseString(String str) {
        if (str.isEmpty())
           return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
