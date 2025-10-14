package bosscoder.maths;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        selfDividingNumbers(1, 22).forEach(System.out::println);
    }

    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumberList = new ArrayList<>();
        while (left <= right) {
            int i = left;
            boolean notSelfDividingNumberFlag = false;
            while (i != 0) {
                int mod = i % 10;
                if (mod == 0) {
                    notSelfDividingNumberFlag = true;
                    break;
                }
                if (left % mod != 0) {
                    notSelfDividingNumberFlag = true;
                    break;
                }
                i /= 10;
            }
            if (!notSelfDividingNumberFlag) {
                selfDividingNumberList.add(left);
            }
            left++;
        }
        return selfDividingNumberList;
    }
}
