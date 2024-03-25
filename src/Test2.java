import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class Test2 {

  public static <String> Map<String, Long> frequencyMap(Stream<String> elements) {
    return elements.collect(
        Collectors.groupingBy(
            Function.identity(),
            HashMap::new, // can be skipped
            Collectors.counting()
        )
    );
  }

  public static void main(String args[]) {
    int SCALE = 2;
    RoundingMode DEFAULT_ROUNDING = RoundingMode.HALF_UP;
    int DIVIDER = 100;
   System.out.println(BigDecimal.valueOf(100).divide(BigDecimal.valueOf(DIVIDER), SCALE, DEFAULT_ROUNDING));

  }


//  Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?

//  Q3 How to find duplicate elements in a given integers list in java using Stream functions?

//   Q4 Given the list of integers, find the first element of the list using Stream functions?

//  Q7 Given a String, find the first non-repeated character in it using Stream functions?

  public static void no() {
    String input = "Java Hungry Blog Alive is Awesome";

    Character result = input.chars() // Stream of String
        .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() == 1L)
        .map(entry -> entry.getKey())
        .findFirst()
        .get();
    System.out.println(result);
  }
}