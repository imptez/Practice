package Job;

import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class CharacterFrequencyCalculator {

    public static <Character> Map<Character, Long>  frequencyMap(Stream<Character> elements) {
        return elements.collect(
                Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new, // can be skipped
                        Collectors.counting()
                )
        );
    }

    public static void main( String args[] ) {
        String aString = "This is Testing ";
        String newStr = aString.replaceAll("\\s", "");
        System.out.println(frequencyMap(newStr.chars().mapToObj(c -> (char) c)));
        System.out.println("The Input String is "+aString);
        Map<Character, Long> collect = newStr.chars().mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(value -> value.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        collect.forEach((s,c)-> System.out.println("the character is "+s+" frequency is "+c) );
        findDuplicateCharacter(newStr);
    }

    public static void findDuplicateCharacter(String str){
        Set<Character> isDuplicate=new HashSet<>();
        str.chars()
                .forEach(value -> {
                    if(!isDuplicate.add((char)value)){
                        System.out.println("The Duplicate Character the String is "+(char)value);
                    }
                });
    }
}
