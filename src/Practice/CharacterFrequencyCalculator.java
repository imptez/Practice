package Practice;

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
