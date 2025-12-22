package bosscoder.stack;

public class MinStackClient {
    public static void main(String[] args) {
        MinStack st = new MinStack();

        st.push(5);
        st.push(10);
        st.push(2);
        st.push(8);

        System.out.println("Current Min: " + st.getMin()); // 1
        System.out.println("Pop: " + st.pop());             // 1
        System.out.println("Current Min: " + st.getMin());  // 2
        System.out.println("Pop: " + st.pop());             // 10
        System.out.println("Current Min: " + st.getMin());  // 2
    }


}
