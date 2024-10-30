package Job;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void filter() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("From Method filter()");
        numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }

    public static void maxValue() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("From Method maxValue()");
        numbers.stream()
                .max(Integer::compareTo).ifPresent(System.out::println);
    }

    public static void sumValue() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("From Method sumValue()");
        Integer sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void upperCase() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("From Method upperCase()");
        names.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void sortValue() {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 4, 3, 6);
        System.out.println("From Method sortValue()");
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    public static void countElements() {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 4, 3, 6);
        System.out.println("From Method countElements()");
        long count = numbers.stream()
                .filter(num -> num > 5)
                .count();
        System.out.println(count);
    }

    public static void distinctElements() {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 4, 3, 6, 7, 8, 6, 4, 4, 3, 2, 1);
        System.out.println("From Method distinctElements()");
        numbers.stream()
                .distinct().forEach(System.out::println);
    }

    public static void findAnyElements() {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 4, 3, 6, 7, 8, 6, 4, 4, 3, 2, 1);
        System.out.println("From Method findAnyElements()");
        numbers.stream()
                .findAny().ifPresent(System.out::println);
    }

    public static void getFirstNames() {
        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris", "Charlie Lou");
        System.out.println("From Method getFirstNames()");
        fullNames.stream()
                .map(name -> name.split(" ")[0])
                .forEach(System.out::println);
    }

    public static void allMatch() {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 4, 3, 6, 7, 8, 6, 4, 4, 3, 2, 1);
        System.out.println("From Method allMatch()");
        System.out.println(numbers.stream()
                .allMatch(num -> num > 0));
    }

    public static void noneMatch() {
        List<Integer> numbers = Arrays.asList(1, 8, -17, 4, -23, 6, 7, -8, 6, 4, 4, 3, -2, 1);
        System.out.println("From Method noneMatch()");
        System.out.println(numbers.stream()
                .noneMatch(num -> num < 0));
    }

    public static void flatMap() {
        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5), Arrays.asList(12, 21));
        System.out.println("From Method flatMap()");
        nestedNumbers.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

    public static void groupingBy() {
        List<Person> persons = Arrays.asList(
                new Person(1, "Alex", 100d, new Department(1, "HR")),
                new Person(2, "Brian", 200d, new Department(1, "HR")),
                new Person(3, "Charles", 900d, new Department(2, "Finance")),
                new Person(4, "David", 200d, new Department(2, "Finance")),
                new Person(5, "Edward", 200d, new Department(2, "Finance")),
                new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
                new Person(7, "George", 900d, new Department(3, "ADMIN")));
        System.out.println("From Method groupingBy()");
        Map<Department, List<Person>> collect = persons.stream()
                .collect(Collectors.groupingBy(Person::getDepartment));

        collect.forEach((department, people) -> System.out.println("Department is = " + department.getName() + ", People's are = " + people));
    }

    public static void peakElements() {
        List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        System.out.println("From Method peakElements()");
        nestedNumbers.stream()
                .peek(System.out::println)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

    public static void limitElements() {
        List<Integer> numbers = Arrays.asList(1, 8, -17, 4, -23, 6, 7, -8, 6, 4, 4, 3, -2, 1);
        System.out.println("From Method limitElements()");
        numbers.stream()
                .limit(5)
                .forEach(System.out::println);
    }

    public static void thirdHighestElement() {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 4, 3, 6, 7, 8, 6, 4, 4, 3, 2, 1);
        System.out.println("From Method thirdHighestElement()");
        numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst().ifPresent(System.out::println);
    }

    public static void convertToSet() {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 4, 3, 6, 7, 8, 6, 4, 4, 3, 2, 1);
        System.out.println("From Method convertToSet()");
        numbers.stream()
                .collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void summarizingStatistics() {
        List<Integer> numbers = Arrays.asList(1, 8, 7, 4, 3, 6, 7, 8, 6, 4, 4, 3, 2, 1);
        System.out.println("From Method summarizingStatistics()");
        IntSummaryStatistics intSummaryStatistics = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
    }

    public static void main(String[] args) {
        filter();
        maxValue();
        sumValue();
        upperCase();
        sortValue();
        countElements();
        distinctElements();
        findAnyElements();
        getFirstNames();
        allMatch();
        noneMatch();
        flatMap();
        groupingBy();
        peakElements();
        limitElements();
        thirdHighestElement();
        convertToSet();
        summarizingStatistics();
    }
}
