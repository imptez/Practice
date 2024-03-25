import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test8 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        //rraysAsList("Imptez", "Mohanty", "Sasmita", "Jena");
        nameList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        nameList.forEach(System.out::println);
    }
}
