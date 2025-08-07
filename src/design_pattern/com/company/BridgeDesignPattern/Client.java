package design_pattern.com.company.BridgeDesignPattern;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer>  fifoCollection = new Queue<Integer>(new SinglyLinkedList<Integer>());
		fifoCollection.offer(10);
		fifoCollection.offer(40);
		fifoCollection.offer(80);

		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
	}

}
