package leetcode;

import java.util.Arrays;
import java.util.List;
import leetcode.InvertedBinaryTree.TreeNode;

public class InvertedBinaryTree {

  //Definition for a binary tree node.
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    @Override
    public String toString() {
      return "TreeNode{" +
          "val=" + val +
          ", left=" + left +
          ", right=" + right +
          '}';
    }
  }

  public static void main(String[] args) {
    List<Integer> rootList = Arrays.asList(4, 2, 7, 1, 3, 6, 9);

    TreeNode root1 = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9)));

    TreeNode root2 = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9)));

    System.out.println(equalTree(root1,root2));
  }

  public static Boolean equalTree(TreeNode root1,TreeNode root2) {

    if(root1 == null && root2 == null)
      return true;

    if(root1 == null && root2 == null)
      return true;

    if(root1 != null  && root2 != null) {

      return ((root1.val == root2.val) &&
              (equalTree(root1.left, root2.left)) &&
              (equalTree(root1.right, root2.right)));
    }
    return false;
  }
}