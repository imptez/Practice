import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test14 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 3, 7, 9, 2, 6);
        Map<Integer, List<ValueOfMap>> map = new HashMap<>();

        for (Integer num : list) {
            map.put(num, Collections.emptyList());
        }

        for (int i = 0; i < list.size(); i++) {
            int o1 = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                int o2 = list.get(j);
                if (i != j) {
                    if (map.containsKey(o1 + o2)) {
                        ValueOfMap valueOfMap = new ValueOfMap(o1, o2);
                        if (!map.get(o1 + o2).isEmpty()) {
                            boolean b = map.get(o1 + o2).stream().noneMatch(valueOfMap1 -> valueOfMap1.getA() == o2 && valueOfMap1.getB() == o1);
                            if (b)
                                map.get(o1 + o2).add(valueOfMap);
                        } else {
                            List<ValueOfMap> valueOfMaps = new ArrayList<>();
                            valueOfMaps.add(valueOfMap);
                            map.put(o1 + o2, valueOfMaps);
                        }
                    }
                }
            }
        }
        map.forEach((integer, valueOfMaps) -> {
            if (!valueOfMaps.isEmpty()) {
                System.out.println("the key is " + integer);
                System.out.println("The value is ");
                valueOfMaps.forEach(System.out::println);
            }
        });

    }
}
