# String Problems

## Overview

String manipulation is a fundamental aspect of programming. This section covers various string operations, pattern matching, and common string-related problem-solving techniques.

## Common Patterns

1. **String Comparison**
   - Anagram checking
   - Common prefix/suffix
   - Edit distance
2. **String Manipulation**
   - Reversal operations
   - Word operations
   - Character replacement
3. **Pattern Matching**
   - Substring search
   - KMP algorithm
   - Rabin-Karp
4. **String Parsing**
   - Numeric conversion
   - Special formats (Roman numerals)
   - Token processing

## Problem List

| Problem                                         | Pattern             | Difficulty |
| ----------------------------------------------- | ------------------- | ---------- |
| [Anagrams](./Anagrams/)                         | String Comparison   | Easy       |
| [Longest Common Prefix](./LongestCommonPrefix/) | String Comparison   | Easy       |
| [Reverse Words](./ReverseWords/)                | String Manipulation | Medium     |
| [Roman To Integer](./RomanToInteger/)           | String Parsing      | Easy       |

## Learning Path

1. Basic string operations
2. String comparison techniques
3. Pattern matching algorithms
4. Advanced string manipulations

## Key Concepts

1. **String Properties**
   - Immutability
   - Character encoding
   - String pooling
2. **Common Templates**

   ```java
   // Character Frequency Counter
   int[] freq = new int[26];  // for lowercase letters
   for (char c : s.toCharArray()) {
       freq[c - 'a']++;
   }

   // String Builder for Manipulations
   StringBuilder sb = new StringBuilder();
   for (char c : s.toCharArray()) {
       if (condition) {
           sb.append(transformedChar);
       }
   }
   return sb.toString();

   // Two Pointer String Operations
   int left = 0, right = s.length() - 1;
   while (left < right) {
       // process chars at left and right
       left++;
       right--;
   }
   ```

## Implementation Tips

1. **Performance Considerations**

   - Use StringBuilder for concatenations
   - Consider string immutability
   - Choose appropriate data structures
   - Handle large strings efficiently

2. **Edge Cases**

   - Empty strings
   - Single character
   - All same characters
   - Special characters
   - Unicode considerations

3. **Space Optimization**
   - In-place operations when possible
   - Efficient string splitting
   - Memory-efficient algorithms

## Common String Operations

```java
// String to char array
char[] chars = s.toCharArray();

// Character checking
Character.isLetterOrDigit(c)
Character.isWhitespace(c)
Character.toLowerCase(c)

// String splitting
String[] words = s.split("\\s+");

// Trimming
s = s.trim();
```

## Pattern Recognition Guide

1. **When to use HashMap/Array**

   - Character frequency counting
   - Anagram problems
   - Pattern matching

2. **When to use Two Pointers**

   - Palindrome checking
   - Reversal problems
   - Window problems

3. **When to use StringBuilder**
   - Multiple concatenations
   - Character-by-character building
   - Reverse operations

## Folder Structure

Each problem folder contains:

- `Question.md`: Problem statement, examples, approach
- `Solution.java`: Implementation with detailed comments
- `TestCases.md` (where applicable): Test scenarios
