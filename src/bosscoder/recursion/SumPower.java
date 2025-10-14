package bosscoder.recursion;

import java.util.ArrayList;
import java.util.List;

public class SumPower {

    public static void main(String[] args) {
        int x = 100;
        int n = 2;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        generatePowerSubSet(x, n, 1, 0, curr, result);
        result.forEach(System.out::println);
    }

    static void generatePowerSubSet(int x, int n, int nNum, int sum, List<Integer> curr,List<List<Integer>> result){

        int power = (int) Math.pow(nNum, n);
        if (sum + power > x && sum != x) {
            return;
        }

        if (sum > x) {
            return;
        }
        if (sum == x) {
            result.add(new ArrayList<>(curr));
            return;
        }


        curr.add(nNum);
        generatePowerSubSet(x, n, nNum + 1, sum + power, curr, result);
        curr.remove(curr.size() - 1);

        generatePowerSubSet(x, n, nNum + 1, sum, curr, result);
    }
}
