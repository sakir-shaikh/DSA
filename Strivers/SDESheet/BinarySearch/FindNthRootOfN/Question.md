# Coding Problem - Nth Root of an Integer  
Given two integers `n` and `m`, find the integer `x` such that `x^n = m`. If no such integer exists, return -1.  
Approach: Use binary search between 1 and m. At each step, compute `mid^n` and compare it to m. Adjust the search range accordingly. If an exact match is found, return mid.  
Complexity: O(log m) time due to binary search, O(1) space.  
Example:  
Input: n = 3, m = 27  
Output: 3  
Tags: Binary Search, Math, Exponentiation
