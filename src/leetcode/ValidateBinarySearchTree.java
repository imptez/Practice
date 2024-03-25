package leetcode;

public class ValidateBinarySearchTree {


  public static void main(String[] args) {
    //TreeNode treeNode = new TreeNode(9, new TreeNode(3), new TreeNode(20, new TreeNode(21), new TreeNode(22)));
    TreeNode treeNode = new TreeNode(1, new TreeNode(1), null);
    System.out.println(isValidBST(treeNode));
  }

  public static boolean isValidBST(TreeNode root) {
    return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  public static boolean isValidBST(TreeNode root, long minVal, long maxVal) {
    if (root == null) return true;
    if (root.val >= maxVal || root.val <= minVal) return false;
    return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
  }
}
