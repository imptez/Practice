package multithread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //executorServiceOnly();
        //  executorServiceWithFurure();
        // executorServiceWithInvokeAll();
        executorServiceWithInvokeAny();
    }

    private static void executorServiceWithInvokeAny() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> callableList = Arrays.asList(
                () -> 20 + 30,
                () -> 10 + 2,
                () -> 15 + 7);
        Integer task = executorService.invokeAny(callableList);
        System.out.println(task);
    }

    private static void executorServiceWithInvokeAll() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> callableList = Arrays.asList(
                () -> 20 + 30,
                () -> 10 + 2,
                () -> 15 + 7);
        List<Future<Integer>> futures = executorService.invokeAll(callableList);

        for (Future<Integer> future : futures) {
            System.out.println("Task result: " + future.get() + " Thread: ");
        }
    }

    private static void executorServiceWithFurure() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1 + 20;
            }
        });
        System.out.println("Task result: " + future.get());
    }

    private static void executorServiceOnly() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task());
        }

        executorService.shutdown();
    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
