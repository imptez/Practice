package leetcode;

public class Palindrome {

  public static void main(String[] args) {
    System.out.println(isPalindromeWithoutString(121));
    System.out.println(isPalindrome2(-121));
  }


  public static boolean isPalindromeWithoutString(int x) {//121
    if (x < 0) {
      return false;
    }
    int sum = 0;
    int num = x;
    while (num > 0) {
      sum = (sum * 10) + (num % 10);//121%10 =1
      num = num / 10;//12
    }
    if (sum == x) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isPalindrome(int x) {
    int i = x;
    int num = 0;
    while(i>=1) {
      int rem = i%10;
      num = num*10+rem;
      i=i/10;
    }
    return num==x;
  }

  public static boolean isPalindrome2(int x) {
    if (x<0 || (x!=0 && x%10==0)) return false;
    int rev = 0;
    while (x>rev){
      rev = rev*10 + x%10;
      x = x/10;
    }
    return (x==rev || x==rev/10);
  }
}
