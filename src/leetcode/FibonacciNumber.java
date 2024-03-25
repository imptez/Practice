package leetcode;

public class FibonacciNumber {

  public static void main(String[] args) {
    System.out.println(fib(4));
  }

  public static int fib(int n) {

    if(n<=1)
    {
      return n;
    }
    int i = 0;
    int j = 1;
    for (int m = 1; m < n; m++) {
      int sum = i + j;//0+0+1
      i = j;//1
      j = sum;//1

    }
    return j;
  }
}
