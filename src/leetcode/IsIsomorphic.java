package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character
    while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

    Example 1:
    Input: s = "egg", t = "add"
    Output: true

    Example 2:
    Input: s = "foo", t = "bar"
    Output: false

    Example 3:
    Input: s = "paper", t = "title"
    Output: true
*/


public class IsIsomorphic {
  public static void main(String[] args) {
    System.out.println(isIsomorphic("paper", "title"));
  }

  public static boolean isIsomorphic(String s, String t) { //egg add

    Map<Character, Character> isoMap = new HashMap<>();
    //Map<Character,Boolean> checkMap=new HashMap<>();
    Set<Character> checkSet = new HashSet<>();
    if (s.length() != t.length()) {
      return false;
    }
    for (int i = 0; i < s.length(); i++) { //3
      if (!isoMap.containsKey(s.charAt(i))) {  //egg
        if (checkSet.add(t.charAt(i))) {//ad
          isoMap.put(s.charAt(i), t.charAt(i));//e,a,g,d
        } else {
          return false;
        }
      } else {
        if (!isoMap.get(s.charAt(i)).equals(t.charAt(i))) {
          return false;
        }
      }
    }
    return true;
  }
}
