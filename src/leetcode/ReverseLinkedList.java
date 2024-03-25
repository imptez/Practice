package leetcode;

public class ReverseLinkedList {

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    System.out.println(reverseList(listNode1));

  }

  public static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    while (head != null) {
     ListNode next = head.next;
     head.next =prev;
     prev =head;
     head=next;
    }
    return prev;
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
