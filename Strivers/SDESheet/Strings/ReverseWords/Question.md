# LeetCode 151 - Reverse Words in a String  
🔗 [Problem Link](https://leetcode.com/problems/reverse-words-in-a-string/)  
Given an input string `s`, reverse the order of the words. A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space. Return a string of the words in reverse order, joined by a single space, with no leading or trailing spaces.  
Approach: Trim leading/trailing spaces, split the string by one or more spaces using regex, reverse the array of words, and join them with a single space.  
Complexity: O(n) time for splitting and reversing, O(n) space for the new array.  
Example:  
Input: "  the sky  is blue "  
Output: "blue is sky the"  
Tags: String, Two Pointers, Splitting, Trimming
