package sapient;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringProblem {
    /**
     * 3. Given a list of logs with IP addresses in the following format.
     * lines = ["10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"]
     * Return the most frequent IP address from the logs. The retuned IP address value must be in a string format.
     * If multiple IP addresses have the count equal to max count, then return the address as a
     * comma-separated string with IP addresses in sorted order.
     */

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.2 - GET 2020-08-24",
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.2 - GET 2020-08-24"
        );


        Map<String, Long> ipMap = lines.stream()
                .map(s -> s.split("-")[0])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long maxCount = ipMap.values().stream().mapToLong(Long::longValue).max().orElse(0);

        String ips = ipMap.entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(ips);
    }
}
