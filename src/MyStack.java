import java.util.ArrayList;
import java.util.List;


public class MyStack <R> {

    public MyStack() {
        this.list = new ArrayList<>();
    }

    List<R> list;

    public R pop() {
        R num = list.get(list.size() - 1);
        list.remove(num);
        return num;
    }

    public void push(R a) {
        list.add(0, a);
    }
}
