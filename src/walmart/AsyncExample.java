package walmart;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class AsyncExample {
    public static void main(String[] args) throws Exception {
        /*CompletableFuture.runAsync(() -> {
            getEven();
            getOdd();
        }).get();*/

        CompletableFuture<String> oddCompletableFuture = CompletableFuture.supplyAsync(() -> getOdd());
        CompletableFuture<String> evenCompletableFuture = CompletableFuture.supplyAsync(() -> getEven());

        CompletableFuture<String> combinedFuture
                = oddCompletableFuture.thenCombine(
                evenCompletableFuture, (m1, m2) -> m1 + " " + m2);
        combinedFuture.get();

    }

    private static String getOdd() {
        Random rand = new Random();
        int count = 0;
        while (count < 10) {
            System.out.println("From Odd Function " + rand.nextLong());
            count++;
        }
        return null;
    }


    private static String getEven() {
        Random rand = new Random();
        int count = 0;
        while (count < 10) {
            System.out.println("From Even Function " + rand.nextInt(1000));
            count++;
        }
        return null;
    }

}