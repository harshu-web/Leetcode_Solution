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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i=1;
        ListNode curr=head;
        ListNode prev=null;
        while(i!=left){
            prev=curr;
            curr=curr.next;
            i++;
        }
        ListNode PointerTostart=prev;
        ListNode start=curr;
        prev=null;
        while(i!=right+1){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            i++;
        }
        start.next=curr;
        if(PointerTostart!=null){
            PointerTostart.next=prev;
        }
        else{
            return prev;
        }
        return head;
    }
}