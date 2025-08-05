import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}


class Solution {
    void visit(Node root, int depth, Map<Integer, Node> map) {
        if (root == null) return;
        map.put(depth, root);
        visit(root.left, depth + 1, map);
        visit(root.right, depth + 1, map);
    }

    ArrayList<Integer> rightView(Node root) {
        Map<Integer, Node> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        visit(root, 0, map);
        map.values().forEach(node -> list.add(node.data));
        return list;
    }
}
