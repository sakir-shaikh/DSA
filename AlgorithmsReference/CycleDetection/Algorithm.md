# Cycle Detection Algorithms

## Description

Cycle detection can be performed in graphs (DFS, BFS) and linked lists (Floyd’s Tortoise and Hare).

## Pseudocode (Linked List)

```
function hasCycle(head):
    slow = head
    fast = head
    while fast != null and fast.next != null:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return true
    return false
```

## Steps

1. Use two pointers (slow and fast) for linked lists.
2. Use DFS/BFS for graphs, marking visited nodes.
