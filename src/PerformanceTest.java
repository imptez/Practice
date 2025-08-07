import java.util.Arrays;
import java.util.List;

public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // Sequential Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        startTime = System.nanoTime();
        numbers.stream().mapToInt(Integer::intValue).sum();
        endTime = System.nanoTime();
        System.out.println("Sequential stream time: " + (endTime - startTime)/10000);

        // Parallel Stream
        startTime = System.nanoTime();
        numbers.parallelStream().mapToInt(Integer::intValue).sum();
        endTime = System.nanoTime();
        System.out.println("Parallel stream time: " + (endTime - startTime)/10000);
    }

}
