package Job;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Practice1 {
    public static void main(String[] args) {
        List<Coin> coins = new ArrayList<>();
        coins.add(new Coin(1, 1991));
        coins.add(new Coin(2, 1991));
        coins.add(new Coin(5, 1991));
        coins.add(new Coin(1, 1993));
        coins.add(new Coin(2, 1993));
        coins.add(new Coin(1, 1993));
        coins.add(new Coin(1, 1991));
        coins.add(new Coin(2, 1991));
        coins.add(new Coin(5, 1991));
        coins.add(new Coin(1, 1993));
        coins.add(new Coin(2, 1993));
        coins.add(new Coin(5, 1993));
        coins.add(new Coin(5, 1993));
        List<Coin> collect = coins.stream().filter(coin -> coin.getValue() > 2).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

    public static void getFrequency(List<Coin> coins) {
        Map<Coin, Long> map = coins.stream()
                .collect(groupingBy(coin -> coin, counting()));
        Stream<List<Coin>> listStream = partitionList(coins, 2);
        listStream.forEach(System.out::println);
       // map.forEach((coin, aLong) -> System.out.println("The key is ["+coin+"] the count is "+aLong));
    }

    private static <T> Stream<List<T>> partitionList(List<T> source, int batchSize) {
        if (batchSize <= 0) {
            throw new IllegalArgumentException(String.format("The batchSize cannot be smaller than 0. Actual value: %s", batchSize));
        }
        if (source.isEmpty()) {
            return Stream.empty();
        }
        int nrOfFullBatches = (source.size() - 1) / batchSize;
        return IntStream.rangeClosed(0, nrOfFullBatches)
                .mapToObj(batch -> {
                    int startIndex = batch * batchSize;
                    int endIndex = (batch == nrOfFullBatches) ? source.size() : (batch + 1) * batchSize;
                    return source.subList(startIndex, endIndex);
                });
    }

   /* public static void getFrequency(List<Coin> coins){
        List<Map<Integer,Integer>> freqList = new ArrayList<>();
        for(Coin coin :coins){
            int value = coin.getValue();
            if(freqList.size()-1 >= value){
                Map<Integer, Integer> integerIntegerMap = freqList.get(value);
                if(integerIntegerMap.containsKey(coin.getYear())){
                    integerIntegerMap.put(coin.getYear(),integerIntegerMap.get(coin.getYear())+1);
                }
            }
        }
    }*/
}
