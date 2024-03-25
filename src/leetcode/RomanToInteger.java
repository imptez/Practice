package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static void main(String[] args) {
    System.out.println(romanToInt("LVIII"));
  }

  public static int romanToInt(String s) {
    Map<Character, Integer> romanIntegerMap = new HashMap<>();
    romanIntegerMap.put('I', 1);
    romanIntegerMap.put('V', 5);
    romanIntegerMap.put('X', 10);
    romanIntegerMap.put('L', 50);
    romanIntegerMap.put('C', 100);
    romanIntegerMap.put('D', 500);
    romanIntegerMap.put('M', 1000);

    int n = s.length();
    int prev = romanIntegerMap.get(s.charAt(n - 1));
    int result = prev, current;
    for (int i = n - 2; i >= 0; i--) {
      current = romanIntegerMap.get(s.charAt(i));
      if (current < prev) {
        result -= current;
      } else {
        result += current;
      }
      prev = current;
    }
    return result;
  }
}



