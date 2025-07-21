# LeetCode 73 - Set Matrix Zeroes

🔗 [Problem Link](https://leetcode.com/problems/set-matrix-zeroes/)

---

## 🧠 Problem Statement

Given an `m x n` integer matrix, if an element is `0`, set its entire row and column to `0`. You **must do it in place**.

---

## 📌 Constraints

- `1 <= m, n <= 200`
- `-2³¹ <= matrix[i][j] <= 2³¹ - 1`

---

## ✅ Approach: In-Place with Constant Space

1. Use the **first row and first column** as markers to keep track of zeroes.
2. Use two additional flags (`firstRow`, `firstCol`) to separately handle the first row and column.
3. Traverse the matrix:
   - Mark the row and column headers if a zero is found.
4. Second pass:
   - Set matrix cells to zero if their row or column is marked.
5. Finally, zero out the first row and/or column if the respective flags are set.

---

## ⏱️ Time Complexity

