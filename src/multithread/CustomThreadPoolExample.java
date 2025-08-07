package multithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPoolExample {
    public static void main(String[] args) {

        ExecutorService executorService = new ThreadPoolExecutor(2,4,30, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),new ThreadPoolExecutor.CallerRunsPolicy());

        for(int i=0;i<10;i++){
            int taskId = i;
            executorService.submit(() -> System.out.println("Task "+taskId + " executed by " + Thread.currentThread().getName()));
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }


}
