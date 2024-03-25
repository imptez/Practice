package Job;

public class AllPossibleCombinationOfString {

    public static void main(String[] args) {
        printAllCombination("abc", "");
    }

    static void printAllCombination(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            printAllCombination(ros, ans + ch);
        }

    }
}
