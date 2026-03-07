 
 //postorder traversal of a binary tree
package Strivers.SDESheet.BinaryTrees.Traversal.PostOrder;
public class Solution {
    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        
        // Traverse the left subtree
        postOrderTraversal(root.left);
        
        // Traverse the right subtree
        postOrderTraversal(root.right);
        
        // Visit the root node
        System.out.print(root.data + " ");
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
 --- IGNORE ---
 
 class Node {
     int data;
     Node left, right;
     public Node(int data) {
         this.data = data;
         left = right = null;
     }
 }      