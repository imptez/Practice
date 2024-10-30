package scenario_based_questions;

/**
 * Q01.Scenario: You need to load stock exchange security codes with price from a database and cache them for performance.
 * The security codes need to be refreshed say every 30 minutes. This cached data needs to be populated and refreshed by
 * a single writer thread and read by several reader threads. How will you ensure that your read/write solution is scalable and thread safe?
 */

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Solution
 * Option 1: The java.util.concurrent.locks package provides classes that implement read/write locks where the read lock can be executed
 * in parallel by multiple threads and the write lock can be held by only a single thread.
 * The ReadWriteLock interface maintains a pair of associated locks, one for read-only and one for writing.
 * The readLock( ) may be held simultaneously by multiple reader threads, while the writeLock( ) is exclusive.
 * In general, this implementation improves performance and scalability when compared to the mutex locks (i.e. via synchronized key word) when
 *
 * 1. There are more reads and read duration compared to writes and write duration.
 *
 * 2. It also depends on the machine you are running on — for example, multi-core processors for better parallelism.
 */
public class MyStockApp {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, BigDecimal> map = new HashMap<>();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        executor.submit(() -> {
            lock.writeLock().lock();
            System.out.println("Writing ....." );
            try {
                try {
                    TimeUnit.SECONDS.sleep(3); //emulating update
                } catch (Exception e) {
                    e.printStackTrace();
                }
                map.put("stock-ABC", BigDecimal.valueOf(12.35));
            } finally {
                lock.writeLock().unlock();
            }
        });

        Runnable readTask = () -> {
            lock.readLock().lock();
            try {
                System.out.println("Reading ....." + map.get("stock-ABC"));
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                lock.readLock().unlock();
            }
        };

        //multiple reads
        executor.submit(readTask);
        executor.submit(readTask);

        //...............other code. As it keeps running.
        //executor.shutdown();
    }
}

/**
 * Solution 2
 * Option 2: The ConcurrentHashmap is another example where improved performance can be achieved when you have more reads than writes.
 * The ConcurrentHashmap allows concurrent reads and locks only the buckets that are used for modification or insertion of data.
 */

/**
 * Solution 3
 * Option 3: Making use of caching frameworks like EHCache, OSCache, etc.
 * Caching frameworks take care of better memory management with LRU(Least Recently Used) and FIFO(First In First Out) eviction strategies,
 * disk overflow, data expiration and many other optional advanced features, as opposed to writing your own.
 *
 * Here is a working example in Java to Implement an in-memory LRU cache in Java with TTL without using a framework like EHCache.
 */

/**
 * Solution 4
 * Option 4: Using a distributed & an in memory database like Redis. Redis can be a choice for implementing a highly available in-memory cache
 * to decrease data access latency, increase throughput, and ease the load off your relational or NoSQL database and application.
 */
