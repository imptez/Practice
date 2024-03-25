package leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestPalindrome {

  public static void main(String[] args) {
    System.out.println(longestPalindrome1("abccccdd"));
  }

  public static int longestPalindrome(String s) {
    Map<Character, Long> freqMap = s.chars().mapToObj(value -> (char) value).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    int pallindromeLength = 0;
    boolean isContainOddFreq = false;
    for (Character c : freqMap.keySet()) {
      if (freqMap.get(c) % 2 == 0) {
        pallindromeLength = (int) (pallindromeLength + freqMap.get(c));
      } else {
        pallindromeLength = (int) (pallindromeLength + (freqMap.get(c) - 1));
        isContainOddFreq = true;
      }
    }
    if (isContainOddFreq) {
      return pallindromeLength + 1;
    }
    return pallindromeLength;
  }

  public static int longestPalindrome1(String s) {//abccccdd
    // Count odd letters --> Set
    // Edge case
    if(s == null || s.length() == 0) return 0;

    Set<Character> set = new HashSet<>();
    for(char c : s.toCharArray()) {
      if(set.contains(c)) set.remove(c);
      else    set.add(c);
    }
    return s.length() - set.size() == 0 ? 0 :  set.size() + 1;
  }
}
