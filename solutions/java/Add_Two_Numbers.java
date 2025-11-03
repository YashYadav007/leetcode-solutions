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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1 = reverseList(l1);
        // l2 = reverseList(l2);
        ListNode head = new ListNode(-1);
        ListNode currNode = head;
        int sum =0;
        int carry =0;
        while(l1!=null&&l2!=null){
            sum = l1.val + l2.val + carry;
            l1=l1.next;l2=l2.next;
            carry = sum/10;
            currNode.next = new ListNode(sum%10);
            currNode = currNode.next;
        }
        while(l1!=null){
            sum = l1.val + carry;
            l1=l1.next;
            carry = sum/10;
            currNode.next = new ListNode(sum%10);
            currNode = currNode.next;
        }
        while(l2!=null){
            sum = l2.val + carry;
            l2=l2.next;
            carry = sum/10;
            currNode.next = new ListNode(sum%10);
            currNode = currNode.next;
        }
        if(carry == 1 ){
            currNode.next = new ListNode(1);
        }
        return head.next;
    }
    // Public ListNode reverseList(ListNode head){
    //     ListNode currNode = head;
    //     ListNode prevNode = null;
    //     while(currNode!=null){
    //         List nextNode = currNode.next;
    //         currNode.next = prevNode
    //         prevNode = currNode;
    //         currNode = nextNode;

    //     }
    //     return prevNode;
    // }
}