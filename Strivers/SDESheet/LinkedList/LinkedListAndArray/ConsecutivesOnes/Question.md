# LeetCode 485 - Max Consecutive Ones  
🔗 [Problem Link](https://leetcode.com/problems/max-consecutive-ones/)  
Given a binary array nums, return the maximum number of consecutive 1's in the array.  
Approach: Iterate through the array while maintaining a running count of consecutive 1s. Reset the count to 0 when a 0 is encountered. Track the maximum count seen so far.  
Complexity: O(n) time, O(1) space.  
Example:  
Input: [1,1,0,1,1,1]  
Output: 3  
Tags: Array, Sliding Window, Counting
