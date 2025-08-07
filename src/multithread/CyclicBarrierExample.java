package multithread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) {

        int numberOfThreads = 3;

        // Runnable action to run when all threads reach the barrier
        Runnable barrierAction = () -> System.out.println("All threads reached the barrier. Proceeding together...");

        // Create a CyclicBarrier for 3 threads with a barrier action
        CyclicBarrier barrier = new CyclicBarrier(numberOfThreads, barrierAction);

        // Start 3 threads
        for (int i = 1; i <= numberOfThreads; i++) {
            new Thread(new Task(i, barrier)).start();
        }
    }

    static class Task implements Runnable {
        private int id;
        private CyclicBarrier barrier;

        public Task(int id, CyclicBarrier barrier) {
            this.id = id;
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println("Thread " + id + " is doing some work...");
                Thread.sleep(1000 * id); // Simulate work

                System.out.println("Thread " + id + " waiting at the barrier...");
                barrier.await(); // Wait at the barrier

                System.out.println("Thread " + id + " passed the barrier.");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}

