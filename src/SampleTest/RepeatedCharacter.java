package SampleTest;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatedCharacter {
    public static void main(String[] args) {
        String str="cbappaleb";
        IntStream chars = str.chars();
//        chars.collect(Collectors.groupingBy(Function.identity(),))
    }
}
