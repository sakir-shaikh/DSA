# Partition List

## Problem Statement

Given the head of a linked list and a value `x`, partition it such that all nodes less than `x` come before nodes greater than or equal to `x`.

You should preserve the original relative order of the nodes in each of the two partitions.

## Example

**Input:**
```
head = [1,4,3,2,5,2], x = 3
```

**Output:**
```
[1,2,2,4,3,5]
```

## Approach

1. Create two separate linked lists: one for nodes with values less than `x` (`small`), and one for nodes with values greater than or equal to `x` (`big`).
2. Use dummy nodes for both `small` and `big` lists to simplify node insertion and handle head modifications.
3. Traverse the original linked list:
   - If the current node's value is less than `x`, append it to the `small` list.
   - Otherwise, append it to the `big` list.
4. After traversing the entire list:
   - Set the `next` pointer of the last node in the `big` list to `null` to prevent infinite loops/cycles.
   - Connect the `small` list's tail to the head of the `big` list (skip the dummy node of the `big` list).
5. Return the head of the `small` list (which is `dummySmall.next`).

## Edge Cases

- Empty list (`head = null`).
- List with only one node.
- All nodes in the list are less than `x`.
- All nodes in the list are greater than or equal to `x`.
- `x` is smaller than any value in the list.
- `x` is larger than any value in the list.

## Complexity Analysis

- **Time Complexity:** O(N), where N is the number of nodes in the linked list. We traverse the list exactly once.
- **Space Complexity:** O(1), as we are rearranging the existing nodes and only using a constant amount of extra space for pointers. Creating two dummy nodes is O(1) space.

## Pattern Recognition

- **Two Pointer Technique:** Specifically using two separate heads to build two lists concurrently.
- **Dummy Node Technique:** Essential for handling linked list modifications cleanly, especially when the head might change.

## Common Mistakes to Avoid

1. **Forgetting to set the `next` of the last node in the `big` list to `null`.** This is a critical step to avoid cycles in the resulting linked list.
2. **Losing the relative order of elements.** The two-pointer approach naturally preserves this if we append to the ends of the partitioned lists.
3. **Not using dummy nodes.** While possible without them, the logic becomes more complex with multiple `null` checks for the initial nodes of each partition.
