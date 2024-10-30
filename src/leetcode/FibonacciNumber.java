package leetcode;

public class FibonacciNumber {

  public static void main(String[] args) {
    System.out.println(fib(6));
  }

  public static int fib(int n) {

    if(n<=1)
    {
      return n;
    }
    int i = 0;
    int j = 1;
    for (int m = 1; m < n; m++) {
      int sum = i + j;//1,2,3,5,8
      i = j;//1,1,2,3,5
      j = sum;//1,2,3,5,8

    }
    return j;
  }
}
