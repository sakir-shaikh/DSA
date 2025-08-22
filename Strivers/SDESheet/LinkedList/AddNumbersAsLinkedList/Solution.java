/**
 * Definition for singly-linked list node.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    /**
     * Adds two numbers represented as linked lists.
     * The numbers are stored in reverse order.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();  // Dummy node for easier list construction
        ListNode current = dummy;
        int carry = 0;
        
        // Process both lists until we reach end of both and no carry
        while (l1 != null || l2 != null || carry > 0) {
            // Calculate sum including carry
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Update carry and create new node
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        return dummy.next;
    }

    // Helper method to create a linked list from array
    private static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    private static String printList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append("->");
            }
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Regular addition with carry
        ListNode l1 = createList(new int[]{2, 4, 3});  // 342
        ListNode l2 = createList(new int[]{5, 6, 4});  // 465
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println("Test 1: " + printList(result));  // Expected: [7->0->8] (807)
        
        // Test Case 2: Different length lists
        l1 = createList(new int[]{9, 9, 9, 9});  // 9999
        l2 = createList(new int[]{9, 9});        // 99
        result = solution.addTwoNumbers(l1, l2);
        System.out.println("Test 2: " + printList(result));  // Expected: [8->9->0->0->1] (10098)
        
        // Test Case 3: One empty list
        l1 = createList(new int[]{0});
        l2 = createList(new int[]{7, 3});
        result = solution.addTwoNumbers(l1, l2);
        System.out.println("Test 3: " + printList(result));  // Expected: [7->3] (37)
    }
}