import java.util.Arrays;
import java.util.Comparator;

public class test7 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {8, 9, 10}};
        Arrays.stream(a).map(ints -> Arrays
                .stream(ints)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()).forEach(System.out::println);
        System.out.println(args.length);
        test7 test7= new test7();
        test7.disp();
    }

    public void disp(){
        System.out.println("In disp Method ");
    }
}
