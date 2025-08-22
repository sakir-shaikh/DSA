# Add Two Numbers as Linked Lists

## Problem Statement

Given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

## Example

**Input:**

```
l1 = 2->4->3 (represents 342)
l2 = 5->6->4 (represents 465)
```

**Output:**

```
7->0->8 (represents 807)
```

**Explanation:** 342 + 465 = 807

## Approach

1. Create a dummy node to handle edge cases
2. Initialize carry = 0
3. Traverse both lists simultaneously:
   - Calculate sum = carry + l1.val + l2.val
   - Create new node with sum % 10
   - Update carry = sum / 10
4. Handle remaining digits in longer list
5. Don't forget final carry

## Edge Cases

- Lists of different lengths
- Sum with carry at the end
- One empty list
- Leading zeros
- All zeros

## Complexity Analysis

- Time Complexity: O(max(N,M)) where N and M are lengths of input lists
- Space Complexity: O(max(N,M)) for the result list

## Pattern Recognition

Use this pattern when:

- Working with number representations in linked lists
- Need to process digits with carry
- Similar to elementary math addition

## Common Mistakes to Avoid

1. Forgetting to handle the final carry
2. Not handling lists of different lengths
3. Not using a dummy head node
4. Not handling null inputs

## Similar Problems

- Multiply Numbers as Linked Lists
- Add Binary Strings
- Sum of Two Integers
