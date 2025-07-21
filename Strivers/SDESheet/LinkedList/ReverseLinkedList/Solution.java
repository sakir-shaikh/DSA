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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        while(current != null){
            stack.push(current.val);
            current = current.next;
        }
        current = head;
        while(!stack.isEmpty()){
            current.val=stack.pop();
            current = current.next;
        }
        return head;
    }
}