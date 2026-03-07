# Preorder Traversal of Binary Tree

## Problem Statement

Given the root of a binary tree, return the preorder traversal of its nodes' values as a list. In preorder traversal, we visit the nodes in the following order: root node, left subtree, right subtree (Root-Left-Right or NLR).

**Constraints:**

1. The number of nodes in the tree is in the range [0, 100]
2. -100 ≤ Node.val ≤ 100
3. Return the values in the exact order of traversal

## Examples

### Example 1

```
Input:
    1
   / \
  2   3
 / \
4   5

Output: [1,2,4,5,3]
Explanation:
1. Visit root -> print 1
2. Visit left subtree of 1:
   - Visit 2
   - Visit left of 2 -> print 4
   - Visit right of 2 -> print 5
3. Visit right subtree of 1 -> print 3
```

### Example 2

```
Input:
    1
     \
      2
     /
    3

Output: [1,2,3]
Explanation:
1. Visit root -> print 1
2. No left child of 1
3. Visit right subtree:
   - Visit 2
   - Visit left of 2 -> print 3
```

### Example 3

```
Input: []
Output: []
Explanation: Empty tree has no nodes to traverse
```

## Approach & Intuition

1. **Recursive Approach (DFS - Optimal)**

   ```java
   class Solution {
       public List<Integer> preorderTraversal(TreeNode root) {
           List<Integer> result = new ArrayList<>();
           preorder(root, result);
           return result;
       }

       private void preorder(TreeNode node, List<Integer> result) {
           if (node == null) return;

           // First add the node's value
           result.add(node.val);

           // Then recur on left child
           preorder(node.left, result);

           // Finally recur on right child
           preorder(node.right, result);
       }
   }
   ```

2. **Iterative Approach using Stack**

   ```java
   public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       if (root == null) return result;

       Stack<TreeNode> stack = new Stack<>();
       stack.push(root);

       while (!stack.isEmpty()) {
           // Pop and process current node
           TreeNode current = stack.pop();
           result.add(current.val);

           // Push right first (so it's processed after left)
           if (current.right != null) {
               stack.push(current.right);
           }
           // Push left last (so it's processed first)
           if (current.left != null) {
               stack.push(current.left);
           }
       }

       return result;
   }
   ```

3. **Morris Traversal (O(1) Space)**
   ```java
   public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       TreeNode current = root;

       while (current != null) {
           if (current.left == null) {
               result.add(current.val);
               current = current.right;
           } else {
               TreeNode predecessor = current.left;
               while (predecessor.right != null &&
                     predecessor.right != current) {
                   predecessor = predecessor.right;
               }

               if (predecessor.right == null) {
                   result.add(current.val);
                   predecessor.right = current;
                   current = current.left;
               } else {
                   predecessor.right = null;
                   current = current.right;
               }
           }
       }
       return result;
   }
   ```

## Complexity Analysis

1. **Recursive Approach**

   - Time: O(n)
     - Visit each node exactly once
   - Space: O(h)
     - h is height of tree (recursion stack)
     - Worst case O(n) for skewed tree
   - Pros: Simple implementation
   - Cons: Stack space overhead

2. **Iterative Approach**

   - Time: O(n)
     - Process each node once
   - Space: O(h)
     - Stack can contain at most h nodes
     - Worst case O(n) for skewed tree
   - Pros: Better control over process
   - Cons: More complex implementation

3. **Morris Traversal**
   - Time: O(n)
     - Each edge traversed at most twice
   - Space: O(1)
     - No extra space except output list
   - Pros: Constant space complexity
   - Cons: Modifies tree temporarily

## Edge Cases

1. Empty tree (null root)
2. Single node tree
3. Left-skewed tree
4. Right-skewed tree
5. Perfect binary tree
6. Complete binary tree
7. Tree with duplicate values
8. Maximum height tree
9. Tree with negative values
10. Binary search tree (special case)

## Pattern Recognition

This problem relates to:

1. **Tree Traversal Methods**

   - DFS vs BFS choice
   - Stack-based iterations
   - Recursive to iterative conversion

2. **Stack Applications**

   - LIFO for backtracking
   - Path recording
   - Tree serialization

3. **Binary Tree Properties**
   - Tree reconstruction
   - Path finding
   - Tree validation

## Implementation Tips

1. **Recursive Implementation**

   ```java
   // Always check base case first
   if (node == null) return;

   // Follow N-L-R pattern strictly
   result.add(node.val);      // Node
   preorder(node.left);       // Left
   preorder(node.right);      // Right
   ```

2. **Stack Management**

   ```java
   // Push right before left
   stack.push(right);  // Process later
   stack.push(left);   // Process first

   // OR push in reverse order of processing
   if (current.right != null) stack.push(current.right);
   if (current.left != null) stack.push(current.left);
   ```

## Common Templates

```java
// General template for tree traversals
public List<Integer> traverse(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) return result;

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
        TreeNode current = stack.pop();

        // 1. Process current node
        processNode(current, result);

        // 2. Add children in reverse order of processing
        addChildren(current, stack);
    }
    return result;
}

// Customize for different traversals
private void addChildren(TreeNode node, Stack<TreeNode> stack) {
    // For preorder: right then left
    if (node.right != null) stack.push(node.right);
    if (node.left != null) stack.push(node.left);
}
```

## Related Problems

1. Binary Tree Inorder Traversal
2. Binary Tree Postorder Traversal
3. Binary Tree Level Order Traversal
4. Construct Binary Tree from Traversals
5. Serialize and Deserialize Binary Tree
6. Flatten Binary Tree to Linked List
7. Binary Tree Paths
8. Verify Preorder Sequence in BST

## Common Mistakes

1. Wrong traversal order (mixing N-L-R)
2. Not handling null nodes
3. Incorrect stack order in iterative
4. Stack overflow in recursive
5. Not considering space complexity
6. Wrong base cases
7. Modifying tree structure permanently
8. Not clearing data structures
9. Assuming balanced structure
10. Missing edge cases
