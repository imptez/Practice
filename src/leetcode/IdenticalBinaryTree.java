package leetcode;

public class IdenticalBinaryTree {

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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

        TreeNode root1 = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9)));

        TreeNode root2 = new TreeNode(4,new TreeNode(1,new TreeNode(2),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9)));

        System.out.println(equalTree(root1,root2));
    }

    public static Boolean equalTree(TreeNode root1,TreeNode root2) {

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