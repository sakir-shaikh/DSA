/**
 * Problem 86: Partition List
 * Partition a linked list such that all nodes less than x come before nodes greater than or equal to x.
 */
public class PartitionList_8_Java {
    /**
     * Partitions the linked list around value x.
     */
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();  // Dummy node for nodes less than x
        ListNode big = new ListNode();    // Dummy node for nodes greater than or equal to x
        ListNode temp = head;
        ListNode newHead = small;         // To keep track of the start of the small list
        ListNode connector = big;         // To keep track of the start of the big list
        
        while (temp != null) {
            if (temp.val < x) {
                small.next = temp;
                small = small.next;
            } else {
                big.next = temp;
                big = big.next;
            }
            temp = temp.next;
        }
        
        // Finalize the big list and connect the small list to it
        big.next = null;
        small.next = connector.next;
        
        return newHead.next;
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
        if (head == null) return "[]";
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
        PartitionList_8_Java solution = new PartitionList_8_Java();

        // Test Case 1: Standard case
        ListNode head1 = createList(new int[]{1, 4, 3, 2, 5, 2});
        int x1 = 3;
        ListNode result1 = solution.partition(head1, x1);
        System.out.println("Test 1 (x=3): " + printList(result1)); // Expected: [1->2->2->4->3->5]

        // Test Case 2: x is larger than all elements
        ListNode head2 = createList(new int[]{2, 1});
        int x2 = 3;
        ListNode result2 = solution.partition(head2, x2);
        System.out.println("Test 2 (x=3): " + printList(result2)); // Expected: [2->1]

        // Test Case 3: x is smaller than all elements
        ListNode head3 = createList(new int[]{1, 2, 3});
        int x3 = 0;
        ListNode result3 = solution.partition(head3, x3);
        System.out.println("Test 3 (x=0): " + printList(result3)); // Expected: [1->2->3]

        // Test Case 4: Empty list
        ListNode head4 = createList(new int[]{});
        int x4 = 3;
        ListNode result4 = solution.partition(head4, x4);
        System.out.println("Test 4 (empty): " + printList(result4)); // Expected: []
    }
}

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
