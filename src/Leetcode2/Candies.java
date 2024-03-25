package Leetcode2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Candies {

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 3};

        kidsWithCandies(a, 3).forEach(System.out::println);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies).max().getAsInt();

        return Arrays.stream(candies)
                .mapToObj(candy -> {
                    int sum = candy + extraCandies;
                    if (sum >= max) {
                        return true;
                    } else {
                        return false;
                    }
                }).collect(Collectors.toList());

    }
}
