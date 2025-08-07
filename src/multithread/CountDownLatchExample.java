package multithread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        int numberOfThreads = 3;
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        // Create and start worker threads
        for (int i = 1; i <= numberOfThreads; i++) {
            new Thread(new Worker(i, latch)).start();
        }

        // Main thread waits for all workers to finish
        try {
            System.out.println("Main thread waiting for workers to finish...");
            latch.await();
            System.out.println("All workers finished. Main thread proceeding.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Worker implements Runnable {
        private int id;
        private CountDownLatch latch;

        public Worker(int id, CountDownLatch latch) {
            this.id = id;
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                System.out.println("Worker " + id + " is working...");
                Thread.sleep(1000 * id); // simulate work
                System.out.println("Worker " + id + " finished.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                latch.countDown(); // Decrease the latch count
            }
        }
    }
}

