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
    public ListNode partition(ListNode head, int x) 
    {
        ListNode small=new ListNode(0);
        ListNode high=new ListNode(0);
        ListNode small_h=small ,high_h=high;
        while(head!=null)
        {
            if(head.val<x)
            {
               //small values
               small_h.next=head;
               small_h=small_h.next;

            }
            else
            {
                //high values
               high_h.next=head;
               high_h=high_h.next;
            }
            head=head.next;
        }
        high_h.next=null;
        small_h.next=high.next;
        return small.next;

        
    }
}