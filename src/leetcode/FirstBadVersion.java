package leetcode;

public class FirstBadVersion {

  public static void main(String[] args) {
    System.out.println(firstBadVersionEdited(1));
  }

  public static int firstBadVersion(int n) {//10

    int li = 1;
    int hi = n;//10
    int mi = (li + hi) / 2;//5

    while (li <= hi) { //1,3
      {
        if (isBadVersion(mi)) {
          hi = mi;//3
        } else {
            return mi+1;
          }
        }
      mi = (li + hi) / 2; //2
    }
    return -1;
  }

  public static int firstBadVersionEdited(int n) {
    int left = 1, right = n, ans = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2; // to avoid overflow incase (left+right)>2147483647
      if (isBadVersion(mid)) {
        ans = mid; // record mid as current answer
        right = mid - 1; // try to find smaller version in the left side
      } else {
        left = mid + 1; // try to find in the right side
      }
    }
    return ans;
  }

  public static boolean isBadVersion(int version) {
    if (version >= 4) {
      return true;
    }
    return false;
  }
}
