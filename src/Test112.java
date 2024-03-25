public class Test112 {

   /* "abc",

    "abc"
    "acb"
    "bac"
    "bca"
    "cab"
    "cba"

    all combination of string;*/

    public static void main(String[] args) {

        String s = "abc";
        findAllCombination(s, "");
    }

    private static void findAllCombination(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String ros = s.substring(0, i) +
                    s.substring(i + 1);
            findAllCombination(ros, ans + ch);
        }
    }
}
