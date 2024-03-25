public class OddEvenPrintMain {

    boolean odd;
    int count = 1;
    int max = 20;

    public static void main(String[] args) {
        OddEvenPrintMain oep = new OddEvenPrintMain();
        oep.odd = true;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oep.printOdd();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oep.printEven();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printOdd() {
        synchronized (this) {
            while (count < max) {
                System.out.println("Checking even Loop");
                if (!odd) {
                    try {
                        System.out.println("Odd waiting: " + count);
                        wait();
                        System.out.println("Notified odd:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Odd thread : " + count);
                }
                count++;
                odd = false;
                notify();
            }

        }
    }

    public void printEven() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        synchronized (this) {
            while (count < max) {
                System.out.println("Checking even Loop");
                if (odd) {
                    try {
                        System.out.println("Even waiting: " + count);
                        wait();
                        System.out.println("Notified even:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Even thread : " + count);
                }

                count++;
                odd = true;
                notify();
            }

        }
    }
}
