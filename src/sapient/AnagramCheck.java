package sapient;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";

        System.out.println(findAnagram(s1,s2));
    }

    private static boolean findAnagram(String s1, String s2) {

        if(s1.length() != s2.length())
        {
            return false;
        }
        char[] charArray1= s1.toCharArray();
        Arrays.sort(charArray1);
        String str1=new String(charArray1);
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray2);
        String str2=new String(charArray2);
        return str1.equalsIgnoreCase(str2);
    }
}
