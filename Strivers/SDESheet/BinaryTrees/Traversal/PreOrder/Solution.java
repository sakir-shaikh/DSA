package Strivers.SDESheet.BinaryTrees.Traversal.PreOrder;

public class Solution {
    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        
        // Visit the root node
        System.out.print(root.data + " ");
        
        // Traverse the left subtree
        preOrderTraversal(root.left);
        
        // Traverse the right subtree
        preOrderTraversal(root.right);
    }
    
    // Node class definition for the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }   
    
}
