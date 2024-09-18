package Job;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // List of integers
        int[] num={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Stream to filter even numbers, multiply them by 2, and collect to a new list
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = integerStream
                .filter(n -> n % 2 == 0)        // Filter even numbers
                .map(n -> n * 2)
                .collect(Collectors.toList());// Multiply each even number by 2
        collect.forEach(System.out::println);

        // Print the result
        integerStream.forEach(System.out::println);
       // System.out.println("Even numbers multiplied by 2: " + integerStream.fo);
    }
}
