package Job;


import java.util.Objects;

public class Coin {
    int value;
    int year;


    public Coin(int value, int year) {
        this.value = value;
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;
        Coin coin = (Coin) o;
        return value == coin.value && year == coin.year;
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(value, year);
        return hash;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value=" + value +
                ", year=" + year +
                '}';
    }
}
