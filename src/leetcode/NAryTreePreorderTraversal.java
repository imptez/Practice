package leetcode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NAryTreePreorderTraversal {

  public static void main(String[] args) {
    Node child5 = new Node(5);
    Node child6 = new Node(6);
    Node child2 = new Node(2);
    Node child4 = new Node(4);
    List<Node> childrens3 = new LinkedList<>();
    childrens3.add(child5);
    childrens3.add(child6);
    Node child3 = new Node(3, childrens3);
    List<Node> childrens1 = new LinkedList<>();
    childrens1.add(child2);
    childrens1.add(child4);
    childrens1.add(child3);
    Node root = new Node(1, childrens1);

    System.out.println(preorder1(root));
  }

  public static List<Integer> preorder(Node root) {
    LinkedList<Node> stack = new LinkedList<>();
    LinkedList<Integer> outputArray = new LinkedList<>();

    if (root == null) {
      return outputArray;
    }
    stack.add(root);
    while (!stack.isEmpty()) {
      Node node = stack.pollLast();
      outputArray.add(node.val);
      Collections.reverse(node.children);
      for (Node child : node.children) {
        stack.add(child);
      }
    }
    return outputArray;
  }

  public static List<Integer> preorder1(Node root) {
    List<Integer> list = new ArrayList<>();
    if (root == null) return list;

    Stack<Node> stack = new Stack<>();
    stack.add(root);

    while (!stack.empty()) {
      root = stack.pop();
      list.add(root.val);
      for (int i = root.children.size() - 1; i >= 0; i--)
        stack.add(root.children.get(i));
    }

    return list;
  }
}
