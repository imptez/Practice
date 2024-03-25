import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test13 {
    static List<Integer> numbers =new ArrayList<>();

    public static void main(String[] args) {

        Test13 test13=new Test13();
        Integer[] integerStream = {2, 3, 7, 4, 9, 8};

        numbers.addAll(Arrays.asList(integerStream));


        Thread oddThread = new Thread(() -> numbers.forEach(test13::printOdd));

        Thread evenThread = new Thread(() -> numbers.forEach(test13::printEven));

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void printEven(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            if (x % 2 == 0) {
                    System.out.println("Print even " + x);
            }
            notify();
        }
    }

    void printOdd(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            if (x % 2 != 0) {
                    System.out.println("Print ODD " + x);

            }
            notify();
        }
    }
}
