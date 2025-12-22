package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample2 {

    public static void main(String[] args) {
        runExecutorTask();
    }

    static void runExecutorTask(){
        ExecutorService es= Executors.newFixedThreadPool(3);
        for(int i=1;i<=10;i++){
            es.submit(new Task(i));
        }
        es.shutdown();
    }

    static class Task implements Runnable{

        final int number;

        public Task(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("The Countdown is "+number+ " the thread handling it is "+Thread.activeCount());
        }
    }
}
