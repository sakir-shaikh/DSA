# LeetCode 242 - Valid Anagram  
🔗 [Problem Link](https://leetcode.com/problems/valid-anagram/)  

🧩 **Problem**:  
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

🧠 **Approach**:  
Convert both strings to character arrays, sort them, and compare the sorted versions. If they're equal, `t` is an anagram of `s`.

⏱️ **Time & Space Complexity**:  
O(n log n) time due to sorting, O(n) space to store the sorted arrays.

📌 **Example**:  
Input: s = "anagram", t = "nagaram"  
Output: true

🏷️ **Tags**: String, Sorting, Hashing
