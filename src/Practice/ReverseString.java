package Practice;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Welcome";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    private static String reverseString(String str) {

        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
