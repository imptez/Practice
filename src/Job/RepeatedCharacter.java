package Job;

import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;

public class RepeatedCharacter {
    /**
     * Given a String s="cbappaleb", find the first occurred character which is repeated.
     */
    public static void main(String[] args) {
        System.out.println(firstOccurredCharacter("this is Testing"));
        System.out.println(firstOccurredCharacter("cbappaleb"));
    }
    private static Character firstOccurredCharacter(String s){
        String newStr = s.replaceAll("\\s", "");
        Set<Integer> seen = new HashSet<>();
        OptionalInt first = newStr.chars()
                .filter(value -> !seen.add(value))
                .findFirst();

        if(first.isPresent()){
            return (char) first.getAsInt();
        }
        return null;
    }
}
