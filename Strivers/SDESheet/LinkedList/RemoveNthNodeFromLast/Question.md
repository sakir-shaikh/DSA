# Remove Nth Node From End of List

## Problem Statement

Given the head of a linked list, remove the nth node from the end of the list and return its head.

## Examples

**Input:**

```
head = [1->2->3->4->5], n = 2
```

**Output:**

```
[1->2->3->5]
```

**Explanation:** The 2nd node from the end is 4, so we remove it.

**Input:**

```
head = [1], n = 1
```

**Output:**

```
[]
```

## Approach

1. Two-Pointer Technique:

   - Use fast and slow pointers
   - Move fast pointer n steps ahead
   - Move both pointers until fast reaches end
   - Slow pointer will be at (n+1)th node from end
   - Update slow.next to skip nth node

2. Alternative Approach (Two Pass):
   - First pass: count total nodes
   - Second pass: remove (length-n+1)th node

## Edge Cases

- Empty list
- List with single node
- Removing first node (n equals length)
- Removing last node (n=1)
- Invalid n value

## Complexity Analysis

- Time Complexity: O(N) - one pass solution
- Space Complexity: O(1) - constant extra space

## Pattern Recognition

Use this pattern when:

- Need to find/remove node from end
- Two pointer problems
- Distance-based node operations
- Problems requiring nth position from end

## Common Mistakes to Avoid

1. Not handling head node removal
2. Not checking for null pointers
3. Not maintaining proper links
4. Off-by-one errors in counting
5. Not handling invalid inputs

## Implementation Tips

1. Use dummy node to handle head removal
2. Maintain gap of n between pointers
3. Check boundary conditions first
4. Verify pointer positions before modifications
