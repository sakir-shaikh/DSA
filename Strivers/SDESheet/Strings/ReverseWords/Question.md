# Reverse Words in a String

## Problem Statement

Given an input string `s`, reverse the order of the words. A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space. Return a string of the words in reverse order, joined by a single space, with no leading or trailing spaces.

## Example

Input: " the sky is blue "
Output: "blue is sky the"
Explanation: Words are split, reversed, and joined with a single space.

## Approach

- Trim leading/trailing spaces.
- Split the string by one or more spaces using regex.
- Reverse the array of words.
- Join them with a single space.

## Edge Cases

- Input is an empty string.
- Input contains only spaces.

## Complexity

- Time: O(n) for splitting and reversing.
- Space: O(n) for the new array.

## Implementation Notes

- Use regex for splitting.
- Use built-in reverse and join functions.

## References

- [LeetCode 151 - Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)
- Tags: String, Two Pointers, Splitting, Trimming
