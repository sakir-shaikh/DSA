public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode result = new ListNode();
        ListNode head = result;
        if (list1 == null) {
            return l2;
        }
        if (list2 == null) {
            return l1;
        }

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result.next = l1;
                l1 = l1.next;
                result = result.next;
            } else {
                result.next = l2;
                l2 = l2.next;
                result = result.next;
            }
        }
        if (l1 != null)
            result.next = l1;
        if (l2 != null)
            result.next = l2;
        return head.next;
    }
    /*
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
}
