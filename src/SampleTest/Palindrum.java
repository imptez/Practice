package SampleTest;

public class Palindrum {

    public static void main(String[] args) {
        String str1="MADAM";

        String str2= getReverseString(str1);
        System.out.println(str1.equalsIgnoreCase(str2));
    }

    private static String getReverseString(String str1) {
        if(str1.isEmpty()){
            return str1;
        }
        return getReverseString(str1.substring(1))+str1.charAt(0);
    }
}
