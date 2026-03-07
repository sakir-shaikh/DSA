import java.util.*;

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        class Tuple {
            TreeNode node;
            int row;
            int col;

            Tuple(TreeNode node, int row, int col) {
                this.node = node;
                this.row = row;
                this.col = col;
            }
        }

        // Min-heap to sort by col → row → value
        PriorityQueue<Tuple> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.col != b.col) return Integer.compare(a.col, b.col);
                if (a.row != b.row) return Integer.compare(a.row, b.row);
                return Integer.compare(a.node.val, b.node.val);
            }
        );

        // Normal BFS queue
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));

        while (!q.isEmpty()) {
            Tuple t = q.poll();
            pq.offer(t);
            if (t.node.left != null) {
                q.offer(new Tuple(t.node.left, t.row + 1, t.col - 1));
            }
            if (t.node.right != null) {
                q.offer(new Tuple(t.node.right, t.row + 1, t.col + 1));
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        Integer prevCol = null;
        List<Integer> colList = new ArrayList<>();

        while (!pq.isEmpty()) {
            Tuple curr = pq.poll();
            if (prevCol == null || curr.col != prevCol) {
                if (prevCol != null) result.add(colList);
                colList = new ArrayList<>();
                prevCol = curr.col;
            }
            colList.add(curr.node.val);
        }

        result.add(colList); // Add last column
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}
