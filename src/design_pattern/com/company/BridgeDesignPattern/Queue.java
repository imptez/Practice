package design_pattern.com.company.BridgeDesignPattern;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T> {

    private LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        this.list.addFirst(element);
    }

    @Override
    public T poll() {
        return this.list.removeLast();
    }
}
