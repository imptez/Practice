package leetcode;

public class MiddleOfLinkedList {

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,new ListNode(6))))));
    System.out.println(middleNode(listNode1));
  }

  public static ListNode middleNode(ListNode head) {
    ListNode aPointer = head;
    ListNode bPointer = head;
    while (bPointer != null && bPointer.next != null) {
      aPointer = aPointer.next;
      bPointer = bPointer.next.next;
    }
    return aPointer;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return "ListNode{" +
          "val=" + val +
          ", next=" + next +
          '}';
    }
  }
}
