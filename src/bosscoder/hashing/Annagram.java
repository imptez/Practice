package bosscoder.hashing;

public class Annagram {

    public static void main(String[] args) {
        String a="debit card";
        String b="bad credit";

        System.out.println(getAnagram(a, b));
    }

    private static boolean getAnagram(String s1, String s2) {

        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        if(s1.length() != s2.length()) return false;
        int[] counts= new int[26];

        for(int i = 0; i< s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            counts[c1 -'a']++;
            counts[c2 -'a']--;
        }

        for(int count:counts) if(count !=0) return false;
        return true;
    }
}
