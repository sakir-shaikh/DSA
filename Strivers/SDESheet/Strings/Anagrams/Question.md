# Valid Anagram

## Problem Statement

Given two strings `s` and `t`, determine if they are anagrams of each other. An anagram is a word formed by rearranging the letters of another word, using all the original letters exactly once.

## Examples

### Example 1

```
Input: s = "anagram", t = "nagaram"
Output: true
Explanation: Both strings use same letters: 3a, 1g, 1m, 2n, 1r
```

### Example 2

```
Input: s = "rat", t = "car"
Output: false
Explanation: Different character sets
```

### Example 3

```
Input: s = "listen", t = "silent"
Output: true
```

## Approach & Intuition

There are three main approaches:

1. **Character Frequency Count (Recommended)**

   ```java
   // Count frequencies using array
   int[] freq = new int[26];
   for (char c : s.toCharArray()) freq[c - 'a']++;
   for (char c : t.toCharArray()) freq[c - 'a']--;
   for (int f : freq) if (f != 0) return false;
   return true;
   ```

2. **Sorting Approach**

   ```java
   return Arrays.sort(s.toCharArray())
        .equals(Arrays.sort(t.toCharArray()));
   ```

3. **HashMap Approach**
   - Use HashMap for non-lowercase or Unicode strings
   - Count frequencies of first string
   - Decrement for second string
   - Check if all counts are zero

## Complexity Analysis

1. Character Frequency:

   - Time: O(n)
   - Space: O(1) - fixed size array

2. Sorting:

   - Time: O(n log n)
   - Space: O(n) for sorting

3. HashMap:
   - Time: O(n)
   - Space: O(k) where k is character set size

## Edge Cases

1. Empty strings
2. Different lengths
3. Same length but different characters
4. Case sensitivity
5. Unicode characters
6. Single character strings
7. Repeated characters

## Pattern Recognition

Use this approach when:

- Need to compare character compositions
- Order doesn't matter
- Similar problems:
  - Group Anagrams
  - Palindrome Permutation
  - Character Rearrangement

## Implementation Tips

1. Always check length first (must be equal)
2. For ASCII, use array over HashMap
3. Consider case sensitivity requirements
4. Handle special characters if needed
5. Choose approach based on constraints:
   - Limited character set → Array
   - Unicode → HashMap
   - Space constrained → In-place sort

## Common Templates

```java
// Array frequency count
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    int[] freq = new int[26];
    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
        freq[t.charAt(i) - 'a']--;
    }
    for (int f : freq)
        if (f != 0) return false;
    return true;
}
```

## Related Problems

1. Group Anagrams
2. Valid Palindrome
3. Permutation in String
4. Find All Anagrams in a String

## Common Mistakes

1. Not checking string lengths first
2. Using HashMap when array is sufficient
3. Not considering case sensitivity
4. Inefficient sorting for small strings
5. Not handling null inputs
