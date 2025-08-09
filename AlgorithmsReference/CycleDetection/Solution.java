// Linked List Cycle Detection
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // Directed Graph Cycle Detection (DFS)
    public boolean hasCycleGraph(int V, List<Integer>[] graph) {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (dfs(i, graph, visited, recStack)) return true;
        }
        return false;
    }
    private boolean dfs(int v, List<Integer>[] graph, boolean[] visited, boolean[] recStack) {
        if (recStack[v]) return true;
        if (visited[v]) return false;
        visited[v] = true;
        recStack[v] = true;
        for (int neighbor : graph[v]) {
            if (dfs(neighbor, graph, visited, recStack)) return true;
        }
        recStack[v] = false;
        return false;
    }
}
