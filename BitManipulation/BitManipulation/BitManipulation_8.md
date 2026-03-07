# BitManipulation

## Algorithm
# Bit Manipulation Algorithms

## Description

Bit manipulation uses bitwise operators (&, |, ^, ~, <<, >>) to perform operations on integers efficiently.

## Pseudocode (Count Set Bits Example)

```
function countSetBits(n):
    count = 0
    while n > 0:
        count += n & 1
        n = n >> 1
    return count
```

## Steps

1. Use bitwise operators to solve the problem efficiently.
2. Apply masks, shifts, and logical operations as needed.


## Examples
# Bit Manipulation Examples

## Example 1: Count Set Bits

Input: n = 13
Output: 3
Explanation: 13 in binary is 1101, which has 3 set bits.

## Example 2: Find Single Number

Input: nums = [2,2,1]
Output: 1
Explanation: 1 appears only once, others appear twice.

## Example 3: Check Power of Two

Input: n = 16
Output: true
Explanation: 16 is a power of two (10000).


## PatternRecognition
# Pattern Recognition: When to Use Bit Manipulation

## How to Recognize Bit Manipulation Problems

- The problem involves binary representation of numbers
- You need to optimize for speed or space
- The solution requires toggling, setting, or checking bits
- The problem involves powers of two, parity, or XOR

## Common Patterns

- **Count set bits**
- **Find single number in array (XOR)**
- **Check if a number is power of two**
- **Swap numbers without temp variable**
- **Reverse bits**

## Typical Question Keywords

- "Bitwise"
- "XOR"
- "AND/OR"
- "Set/Clear/Toggle bit"
- "Power of two"
- "Parity"

## Example Interview Prompts

- "Count the number of 1s in binary representation."
- "Find the single number in an array where every other appears twice."
- "Check if a number is a power of two."

## How to Get the 'Click'

- If the problem involves binary numbers, think bit manipulation
- If you need to optimize for space/speed, use bitwise operations
- If XOR, AND, OR are mentioned, bit manipulation applies

---

**Tip:** Practice bit manipulation on number and array problems to recognize these patterns quickly!


## README
# Bit Manipulation

## Overview

Bit manipulation is a technique for performing operations on binary numbers using bitwise operators. It is used for optimization, cryptography, and low-level programming.

## Real-life Use Cases

- Data compression
- Cryptography
- Graphics and image processing
- Optimization in competitive programming

## Interview Relevance

Bit manipulation is common in interviews for problems involving numbers, optimization, and tricky logic.

---

## Files

- `Algorithm.md`: Step-by-step explanation and pseudocode
- `PatternRecognition.md`: How to spot bit manipulation problems
- `Examples.md`: Worked examples
- `TestCases.md`: Sample test cases
- `Solution.java`: Java implementation


## TestCases
# Bit Manipulation Test Cases

## Test Case 1: Count Set Bits

Input: n = 7
Expected Output: 3

## Test Case 2: Find Single Number

Input: nums = [4,1,2,1,2]
Expected Output: 4

## Test Case 3: Check Power of Two

Input: n = 18
Expected Output: false



