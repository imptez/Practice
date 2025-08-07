package multithread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        simpleExample();
        simpleWithResultExample();
        simpleWithThenApplyExample();
        simpleWithThenApplyAsyncExample();
        simpleWithThenAcceptsExample();
        simpleWithThenAcceptsAsyncExample();
        methodToDisplayThenCombine();
        methodToDisplayThenCompose();
        methodToDisplayExceptionally();
        methodToCompleteManually();
        methodToCompleteExceptionally();
    }

    private static void methodToCompleteExceptionally() {
        CompletableFuture<Integer> future = new CompletableFuture<>();

        // Completing the future manually with an exception
        future.completeExceptionally(new RuntimeException("Something went wrong!"));

        try {
            future.join();  // This will throw an exception
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());  // Output: Exception: Something went wrong!

        }
    }
    private static void methodToCompleteManually() {
        CompletableFuture<Integer> future = new CompletableFuture<>();

        // Completing the future manually with a value
        future.complete(42);

        Integer result = future.join();
        System.out.println("Manually completed result: " + result);  // Output: Manually completed result: 42

    }

    private static void methodToDisplayExceptionally() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            if (true) throw new RuntimeException("Exception thrown");
            return 10;
        });
        CompletableFuture<Integer> exceptionally = future.exceptionally(throwable -> {
            System.out.println("Error thrown: " + throwable.getMessage());
            return -1;
        });

        Integer result = exceptionally.join();
        System.out.println("Result: " + result);

    }

    private static void methodToDisplayThenCompose() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5);

        // Flattening two CompletableFutures
        CompletableFuture<Integer> composedFuture = future.thenCompose(result -> CompletableFuture.supplyAsync(() -> result * 2));

        Integer finalResult = composedFuture.join();
        System.out.println("Composed result: " + finalResult);  // Output: Composed result: 10

    }

    private static void methodToDisplayThenCombine() {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 2);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 3);

        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + result2);

        Integer combinedResult = combinedFuture.join();
        System.out.println("Combined result: " + combinedResult);  // Output: Combined result: 5

    }

    private static void simpleWithThenAcceptsAsyncExample() {
        CompletableFuture.supplyAsync(() -> {
            return 95;
        }).thenAcceptAsync(integer -> System.out.println("The Result is " + integer));
    }

    private static void simpleWithThenAcceptsExample() {
        CompletableFuture.supplyAsync(() -> {
            return 90;
        }).thenAccept(integer -> System.out.println("The Result is " + integer));
    }

    private static void simpleWithThenApplyAsyncExample() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        }).thenApplyAsync(i -> i + 40);
        Integer result = future.join();
        System.out.println("The Result is "+result);
    }

    private static void simpleWithThenApplyExample() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        }).thenApply(i -> i + 20);
        Integer result = future.join();
        System.out.println("The Result is "+result);
    }

    private static void simpleWithResultExample() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            return 10;
        });
        Integer result = future.join();
        System.out.println("The Result is "+result);
    }

    private static void simpleExample() {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> System.out.println("Task running asynchronously..."));
        future.join();
    }
}
