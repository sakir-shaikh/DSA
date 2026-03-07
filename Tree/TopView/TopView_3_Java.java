import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
//Node
class Node {
    int data;
    Node left, right;
    
    Node(int item) {
        data = item;
        left = right = null;
    }
}
class Solution {
    private static class Pair{
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    
    static ArrayList<Integer> topView(Node root) {
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer , Integer> map = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.offer(new Pair(root, 0));
        
       while(!q.isEmpty()){
           Pair curr = q.poll();
           Node node = curr.node;
           int hd = curr.hd;
           
           if(!map.containsKey(hd)){
               map.put(hd, node.data);
           }
           
           if(node.left != null){q.offer(new Pair(node.left, hd-1));}
           if(node.right != null){q.offer(new Pair(node.right, hd+1));}
           
       }
       
       map.values().stream().forEach(val -> list.add(val));
      
       return list;
    }
}