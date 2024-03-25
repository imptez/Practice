public class ValueOfMap {
    private int a;
    private int b;

    public ValueOfMap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public boolean contains(ValueOfMap a) {
        if (this.a == a.getA() || this.b == a.getB()) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "ValueOfMap{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
