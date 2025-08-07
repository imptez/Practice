package Job;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadedIncrement {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Example input
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        int numThreads = 4;

        System.out.println("Original List: " + numbers);
        incrementListWithThreads(numbers, numThreads);
        //executorServiceWithThreads(numbers,numThreads);
        System.out.println("Updated List: " + numbers);
    }

    private static void executorServiceWithThreads(List<Integer> numbers, int numThreads) throws ExecutionException, InterruptedException {
        int size= numbers.size();
        int chunkSize = ((size + numThreads) - 1) / numThreads;
        ExecutorService executorService= Executors.newFixedThreadPool(numThreads);
        List<Future<Void>> futures = new ArrayList<>();
        for(int i=0;i<numThreads;i++){
            int start=chunkSize*i;
            int end= Math.min(start+chunkSize,size);
            System.out.println("Start "+start+" End "+end);
            if(start>=end){
                break;
            }
            Callable<Void> task = () -> {
                for(int j=start;j<end;j++){
                    numbers.set(j,numbers.get(j)+1);
                }
                return null;
            };
            futures.add(executorService.submit(task));
        }
        for(Future<Void> future:futures){
            future.get();
        }

        executorService.shutdown();
    }






    private static void incrementListWithThreads(List<Integer> numbers, int numThreads) throws InterruptedException {
        int size = numbers.size();
        int chunkSize = ((size + numThreads) - 1) / numThreads;
        System.out.println("The Chunk size is "+chunkSize);
        List<Thread> threads = new ArrayList<>();

        for (int num = 0; num < numThreads; num++) {
            int start = chunkSize * num;
            int end = Math.min(start + chunkSize, size);
            System.out.println("Start "+start+" End "+end);
            if (start >= end) {
                break;
            }
            Thread thread = new Thread(new IncrementTask(numbers, start, end));
            threads.add(thread);
            thread.start();
        }
        for(Thread t:threads){
            t.join();
        }
    }

    private static class IncrementTask implements Runnable {

        List<Integer> numbers;
        int start;
        int end;

        public IncrementTask(List<Integer> numbers, int start, int end) {
            this.start = start;
            this.end = end;
            this.numbers = numbers;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                System.out.print(" the thread is "+i);
                numbers.set(i, numbers.get(i) + 1);
            }
            System.out.println("");
        }
    }
}
