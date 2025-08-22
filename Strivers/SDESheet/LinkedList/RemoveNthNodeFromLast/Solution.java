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
     * Removes the nth node from the end of the linked list
     * Uses two-pointer technique for single pass solution
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Handle edge case of empty list
        if (head == null) return null;
        
        // Create dummy node to handle head removal case
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Move fast pointer n steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) return head; // Invalid n
            fast = fast.next;
        }
        
        // Move both pointers until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Remove nth node from end
        slow.next = slow.next.next;
        
        return dummy.next;
    }

    // Helper method to create a linked list from array
    private static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper method to convert list to string for printing
    private static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append("->");
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Regular case
        ListNode head1 = createList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Test 1 Input: " + listToString(head1) + ", n = 2");
        System.out.println("Test 1 Output: " + listToString(solution.removeNthFromEnd(head1, 2)));
        // Expected: [1->2->3->5]

        // Test Case 2: Remove head
        ListNode head2 = createList(new int[]{1, 2, 3});
        System.out.println("\nTest 2 Input: " + listToString(head2) + ", n = 3");
        System.out.println("Test 2 Output: " + listToString(solution.removeNthFromEnd(head2, 3)));
        // Expected: [2->3]

        // Test Case 3: Single node
        ListNode head3 = createList(new int[]{1});
        System.out.println("\nTest 3 Input: " + listToString(head3) + ", n = 1");
        System.out.println("Test 3 Output: " + listToString(solution.removeNthFromEnd(head3, 1)));
        // Expected: []

        // Test Case 4: Remove last node
        ListNode head4 = createList(new int[]{1, 2, 3, 4});
        System.out.println("\nTest 4 Input: " + listToString(head4) + ", n = 1");
        System.out.println("Test 4 Output: " + listToString(solution.removeNthFromEnd(head4, 1)));
        // Expected: [1->2->3]
    }
}
