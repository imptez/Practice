package SampleTest;

public class ReverseString {
    public static void main(String[] args) {
        String str="Welcome";
        System.out.println(getReverseString1(str));
    }
    private static String getReverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - (i + 1)));
        }
        return sb.toString();
    }

    private static String getReverseString1(String str) {
        if(str.isEmpty()){
            return str;
        }
        return getReverseString(str.substring(1))+str.charAt(0);
    }
}
