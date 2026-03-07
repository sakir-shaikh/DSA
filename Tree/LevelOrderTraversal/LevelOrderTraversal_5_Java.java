import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;


class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    public static void levelOrderVisit(Node root, int level, ArrayList<ArrayList<Integer>> list){
        if(root == null){return;}
        if(list.size() <= level){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.data);
        levelOrderVisit(root.left, level+1,list);
        levelOrderVisit(root.right,level+1, list);
    }
    
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        levelOrderVisit(root, 0, list);
        return list;
    
    }
}





