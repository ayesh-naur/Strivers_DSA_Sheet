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
        if(l1 == null && l2 != null) return l2;
        if(l2 == null && l1 != null) return l1;
        if(l1 == null && l2 == null) return l1;
        int add, carry=0;        
        ListNode ans = new ListNode();
        ListNode temp =ans;
        
        while(l1 != null || l2 != null || carry == 1){
            add = 0;
            if(l1 != null){
                add += l1.val;
                l1 = l1.next;
            }
             if(l2 != null){
                add += l2.val;
                l2 = l2.next;
            }
            add += carry;
            carry = add/10;
            temp.next = new ListNode(add%10);
            temp = temp.next;
        }
                
        return ans.next;
        
    }
    
}
