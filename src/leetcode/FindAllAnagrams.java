package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class FindAllAnagrams {

  public static void main(String[] args) {
    String s = "cbaebabacd", p = "abc";
    findAnagrams(s, p).forEach(System.out::println);
  }


  public static List<Integer> findAnagrams(String s, String p) {
    List<Integer> resultList = new ArrayList<>();
    HashMap<Character, Integer> patterFreq = new HashMap<>();
    HashMap<Character, Integer> sourceFreq = new HashMap<>();
    for (char ch : p.toCharArray()) {
      patterFreq.put(ch, patterFreq.getOrDefault(ch, 0) + 1);
    }
    for (int i = 0; i < p.length(); i++) {
      char ch = s.charAt(i);
      sourceFreq.put(ch, sourceFreq.getOrDefault(ch, 0) + 1);
    }
    int i = p.length();
    while (i < s.length()) {
      if (compare(patterFreq, sourceFreq)) {
        resultList.add(i - p.length());
      }
      char cha = s.charAt(i);
      sourceFreq.put(cha, sourceFreq.getOrDefault(cha, 0) + 1);

      char chr = s.charAt(i - p.length());
      if (sourceFreq.get(chr) == 1) {
        sourceFreq.remove(chr);
      } else {
        sourceFreq.put(chr, sourceFreq.getOrDefault(chr, 0) - 1);
      }
      i++;
    }
    if (compare(patterFreq, sourceFreq)) {
      resultList.add(i - p.length());
    }
    return resultList;
  }

  public static boolean compare(HashMap<Character, Integer> patterFreq, HashMap<Character, Integer> sourceFreq) {
    int count = 0;
    for (Character ch : patterFreq.keySet()) {
      if (sourceFreq.containsKey(ch) && Objects.equals(sourceFreq.get(ch), patterFreq.get(ch))) {
        count++;
      }
    }
    if (count == patterFreq.size()) {
      return true;
    }
    return false;
  }
}
