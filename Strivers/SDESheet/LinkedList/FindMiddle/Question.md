# LeetCode 876 - Middle of the Linked List

🔗 [Problem Link](https://leetcode.com/problems/middle-of-the-linked-list/)

---

## 🧠 Problem Statement

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

---

## ✅ Approach

1. Traverse the list to calculate its total length.
2. Traverse again up to `size / 2` steps to reach the middle node.
3. Return the node at that position.

**Complexity:** `O(n)` time for two traversals, `O(1)` space.

---

## 📘 Example

**Input:**
head = [1,2,3,4,5]


**Output:**
3

---

## 🔁 Tags

`Linked List` `Two Pass` `Middle Node`
