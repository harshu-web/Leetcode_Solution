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
    public ListNode swapNodes(ListNode head, int k) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int tempF=0;
        int tempS=0;
        curr=head;
        int j=0;
        int remember=0;
        int check=n-k+1;
        ListNode firstNode = null;
        ListNode secondNode = null;
        while(curr!=null){ 
            j++; 
            if(j==k){ 
                firstNode = curr;
                tempF=curr.val; 
            } 
            if(j==check){ 
                secondNode = curr;
                tempS=curr.val; 
            } 
            curr=curr.next; 
        } 
        if (firstNode != null && secondNode != null) {
            firstNode.val = tempS;
            secondNode.val = tempF;
        }
        return head;
    }
}