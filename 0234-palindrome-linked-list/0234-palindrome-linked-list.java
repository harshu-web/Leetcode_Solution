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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        ListNode slow=curr;
        ListNode fast=curr;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode SecHalf=slow;
        ListNode prev=null;
        while(SecHalf!=null){
            ListNode temp=SecHalf.next;
            SecHalf.next=prev;
            prev=SecHalf;
            SecHalf=temp;
        }
        curr=head;
        while(prev!=null){
            if(curr.val!=prev.val){
                return false;
            }
            prev=prev.next;
            curr=curr.next;
        }
        return true;
    }
}