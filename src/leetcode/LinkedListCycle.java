package leetcode;

public class LinkedListCycle {

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    System.out.println(detectCycle(listNode1));
  }

  public static ListNode detectCycle(ListNode head) {
    ListNode aPointer = head;
    ListNode bPointer = head;
    while (bPointer != null && bPointer.next != null) {
      aPointer = aPointer.next;
      bPointer = bPointer.next.next;
      if (aPointer == bPointer) {
        aPointer = head;
        while (aPointer != bPointer) {
          aPointer = aPointer.next;
          bPointer = bPointer.next;
        }
        return aPointer;
      }
    }
    return null;
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
