package leetcode;

public class MergeTwoSortedLists {

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    System.out.println(mergeTwoLists(listNode1, listNode2));

  }


  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode tempNode = new ListNode(0);
    ListNode current_node = tempNode;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        current_node.next = list1;
        list1 = list1.next;
      } else {
        current_node.next = list2;
        list2 = list2.next;
      }
      current_node = current_node.next;
    }
    if (list1 != null) {
      current_node.next = list1;
      list1 = list1.next;
    }
    if (list2 != null) {
      current_node.next = list2;
      list2 = list2.next;
    }
    return tempNode.next;
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
