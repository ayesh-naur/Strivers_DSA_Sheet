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
    public ListNode middleNode(ListNode head) {
    //    if(head == null){
   //         return head;
   //     }
   //     ListNode temp = head;
   //     int count = 0;
        
   //     while(temp.next != null){
   //         count++;            
   //         temp = temp.next;
   //     }
   //     int div = count/2;
   //     int mid = (count%2 == 0) ? (div + 1) : div;
        
   //      ListNode newtemp = head;
   //     while(mid>1){
   //      newtemp = newtemp.next;
   //         mid--;
   //     }
        
   //     return newtemp;
         ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
