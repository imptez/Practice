package Job;

public class ThreadDeadlock {
    public static void main(String[] args) {
        String res1 = "Res-1";
        String res2 = "Res-2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (res1) {
                    System.out.println("Thread 1 : Blocked by res 1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }

                    synchronized (res2) {
                        System.out.println("Thread 1 : Blocked by res 2");
                    }
                }
            }
        };

            Thread t2 = new Thread() {
                public void run() {
                    synchronized (res2) {
                        System.out.println("Thread 2 : Blocked by res 2");

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                        }

                        synchronized (res1) {
                            System.out.println("Thread 2 : Blocked by res 1");
                        }
                    }
                }
            };
        t1.start();
        t2.start();
        }
    }
