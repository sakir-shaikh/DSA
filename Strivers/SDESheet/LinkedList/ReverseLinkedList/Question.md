# LeetCode 206 - Reverse Linked List

🔗 [Problem Link](https://leetcode.com/problems/reverse-linked-list/)

---

## 🧠 Problem Statement

Given the `head` of a singly linked list, reverse the list and return the reversed list.

---

## ✅ Approach

1. Traverse the list and push all node values onto a stack.
2. Traverse the list again and replace each node’s value with the top of the stack.
3. This reverses the list by value (not pointers).

**Complexity:** `O(n)` time for two traversals, `O(n)` space for the stack.

---

## 📘 Example

**Input:**
head = [1,2,3,4,5]

**Output:**

---

## 🔁 Tags

`Linked List` `Stack` `Two Pass` `Reverse`
