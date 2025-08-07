package multithread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(2);
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task Executed After 3 sec");
            }
        },3, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(() -> System.out.println("Task Executed at every 2 sec"),0,2,TimeUnit.SECONDS);
    }
}
