package sapient;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str=  "hduiqawduqwhadqd";//"racecars";
        System.out.println(getFirstNonRepeatingChar(str));
    }

    private static String getFirstNonRepeatingChar(String str) {
        Map<Character, Long> collect = str.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Character ch:str.toCharArray()){
            if(collect.get(ch) ==1){
                return ch.toString();
            }
        }
        return "All characters are repeated";
    }
}
