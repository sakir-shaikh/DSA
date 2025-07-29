# LeetCode 13 - Roman to Integer  
🔗 [Problem Link](https://leetcode.com/problems/roman-to-integer/)  
Given a Roman numeral, convert it to an integer. Roman numerals are usually written from largest to smallest left to right, but if a smaller value precedes a larger one, it is subtracted.  
Approach: Create a hashmap for symbol-to-value mapping. Traverse the string from left to right. If a character has a smaller value than the next one, subtract it; otherwise, add it. Handle the last character separately if needed.  
Complexity: O(n) time, O(1) space.  
Example:  
Input: "MCMXCIV"  
Output: 1994  
Tags: String, Hash Map, Greedy, Simulation
