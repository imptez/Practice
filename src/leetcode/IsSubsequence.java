package leetcode;

import java.util.Optional;

/*
    A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters
    without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
*/
public class IsSubsequence {

  public static void main(String[] args) {
    System.out.println(isSubsequence("ace","abcde"));

  }

  public static boolean isSubsequence(String s, String t) {

    int i = 0, j = 0;
    while (i < s.length() && j < t.length()) {
      if (s.charAt(i) == t.charAt(j)) i++;
      j++;
    }
    if (i == s.length()) return true;
    return false;
  }
}
