// inorder traversal of a binary tree
package Strivers.SDESheet.BinaryTrees.Traversal.InOrder;
public class Solution {
    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        
        // Traverse the left subtree
        inOrderTraversal(root.left);
        
        // Visit the root node
        System.out.print(root.data + " ");
        
        // Traverse the right subtree
        inOrderTraversal(root.right);
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
// Node class definition for the binary tree
class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}