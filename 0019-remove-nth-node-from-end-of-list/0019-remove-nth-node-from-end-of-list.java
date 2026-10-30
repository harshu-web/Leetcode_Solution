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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int i=0;
        while(curr!=null){
            i++;
            curr=curr.next;
        }
        int check=i-n;
        int j=0;
        curr=head;
        if(check==0){
            return head.next;
        }
        while(curr!=null){
            j++;
            if (j == check ) { 
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        return head;
    }
}