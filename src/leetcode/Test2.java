//package leetcode;
//
///*
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
// */
//public class Test2 {
//  public static void main(String[] args) {
//    ListNode<N> l1 = new ListNode<N>(2, new ListNode<N>(4, new ListNode<N>(3)));
//    ListNode<N> l2 = new ListNode<N>(5, new ListNode<N>(6, new ListNode<N>(4)));
//    addTwoNumbers(l1,l2);
//
//  }
//
//  public static void addTwoNumbers(ListNode<N> l1, ListNode<N> l2) {
//    ListNode<N> dummyHead = new ListNode<N>(0);
//    ListNode<N> curr = dummyHead;
//    int carry = 0;
//    while (l1 != null || l2 != null || carry != 0) {
//      int x = (l1 != null) ? l1.val : 0;
//      int y = (l2 != null) ? l2.val : 0;
//      int sum = carry + x + y;
//      carry = sum / 10;
//      curr.next = new ListNode<N>(sum % 10);
//      curr = curr.next;
//      if (l1 != null)
//        l1 = l1.next;
//      if (l2 != null)
//        l2 = l2.next;
//    }
//    dummyHead=dummyHead.next;
//    while(dummyHead !=null){
//      System.out.print(dummyHead.val);
//      dummyHead = dummyHead.next;
//    }
//  }
//
//}
//
//class ListNode<N> {
//  int val;
//  ListNode<N> next;
//
//  ListNode() {
//  }
//
//  ListNode(int val) {
//    this.val = val;
//  }
//
//  ListNode(int val, ListNode<N> next) {
//    this.val = val;
//    this.next = next;
//  }
//}
//
//
