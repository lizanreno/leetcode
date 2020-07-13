public class AddTwoNumbersAlgorithm {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int num2 = 0;
        int mut = 1;
        while(l1.next != null){
            num1 = l1.val * mut;
            l1 = l1.next;
            mut = mut * 10;
        }
        mut = 1;
        while(l2.next != null){
            num2 = l2.val * mut;
            l2 = l2.next;
            mut = mut * 10;
        }
        int num3 = num1 + num2;
        ListNode l3 = new ListNode();
        while(num3 / 10 != 0){
            l3.val = num3 % 10;
            num3 = num3 / 10;
            ListNode next = new ListNode();
            l3.next = next;
        }
        return l3;

    }
}