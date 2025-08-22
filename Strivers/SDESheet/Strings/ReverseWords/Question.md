# Reverse Words in a String

## Problem Statement

Given an input string `s`, reverse the order of the words. A word is defined as a sequence of non-space characters. Words in `s` will be separated by at least one space. Return a string of the words in reverse order concatenated by a single space, with no extra spaces.

## Examples

### Example 1

```
Input: s = "the sky is blue"
Output: "blue is sky the"
```

### Example 2

```
Input: s = "  hello world  "
Output: "world hello"
Explanation: Leading/trailing spaces should be removed
```

### Example 3

```
Input: s = "a good   example"
Output: "example good a"
Explanation: Multiple spaces between words reduced to single space
```

## Approach & Intuition

There are three main approaches:

1. **Built-in Functions Approach**

   ```java
   return Arrays.stream(s.trim().split("\\s+"))
          .reduce((b, a) -> a + " " + b)
          .get();
   ```

2. **StringBuilder Approach (Space Optimal)**

   - Reverse entire string
   - Reverse each word
   - Handle spaces carefully

3. **Two-Pointer Approach**
   - Read words from end to start
   - Skip multiple spaces
   - Build result string

## Complexity Analysis

1. Built-in Functions:

   - Time: O(n)
   - Space: O(n)

2. StringBuilder:

   - Time: O(n)
   - Space: O(1) if done in-place

3. Two-Pointer:
   - Time: O(n)
   - Space: O(n) for result

## Edge Cases

1. Empty string
2. Single word
3. Multiple spaces between words
4. Leading/trailing spaces
5. All spaces
6. Single character words
7. Very long words

## Pattern Recognition

Use this approach when:

- Word order needs to be reversed
- Space handling is important
- Similar problems:
  - Reverse individual words
  - Rotate array
  - String manipulation with spaces

## Implementation Tips

1. **Space Handling**

   - Use trim() for leading/trailing spaces
   - Use split("\\s+") for multiple spaces
   - Or handle spaces manually

2. **StringBuilder Usage**

   ```java
   StringBuilder result = new StringBuilder();
   for (String word : words) {
       if (result.length() > 0) result.insert(0, " ");
       result.insert(0, word);
   }
   ```

3. **Manual Space Handling**
   ```java
   while (i < n && s.charAt(i) == ' ') i++;  // skip spaces
   while (i < n && s.charAt(i) != ' ') i++;  // process word
   ```

## Common Templates

```java
// Two-pointer word reversal
void reverseWord(char[] s, int start, int end) {
    while (start < end) {
        char temp = s[start];
        s[start++] = s[end];
        s[end--] = temp;
    }
}
```

## Related Problems

1. Reverse Individual Words
2. Rotate Array
3. Reverse String
4. Remove Extra Spaces

## Common Mistakes

1. Not handling multiple spaces
2. Incorrect space handling at word boundaries
3. Inefficient string concatenation
4. Not considering memory constraints
5. Forgetting edge cases
