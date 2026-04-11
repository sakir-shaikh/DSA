# Backtracking

## Algorithm
# Backtracking Algorithm

## Description

Backtracking is a recursive approach that tries all possible solutions and abandons a path as soon as it determines that the path cannot possibly lead to a valid solution.

## Pseudocode (N-Queens Example)

```
function solve(board, row):
    if row == board.length:
        print(board)
        return
    for col in 0 to board.length - 1:
        if isSafe(board, row, col):
            placeQueen(board, row, col)
            solve(board, row + 1)
            removeQueen(board, row, col)
```

## Steps

1. Try to build a solution incrementally.
2. If a partial solution is invalid, backtrack (remove last choice).
3. Continue until all solutions are found or one is found.


## Examples
# Backtracking Examples

## Example 1: N-Queens

Input: n = 4
Output: All valid arrangements of 4 queens on a 4x4 board

## Example 2: Subsets

Input: nums = [1,2,3]
Output: [[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]]

## Example 3: Permutations

Input: nums = [1,2,3]
Output: [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]


## PatternRecognition
# Pattern Recognition: When to Use Backtracking

## How to Recognize Backtracking Problems

- The problem asks for all possible solutions (permutations, combinations, subsets)
- The problem involves constraints that must be satisfied
- The solution space is exponential
- The problem can be solved recursively by exploring all options

## Common Patterns

- **Generate all permutations/combinations/subsets**
- **Solve puzzles (Sudoku, N-Queens, Crossword)**
- **Find all paths in a maze**
- **Constraint satisfaction problems**

## Typical Question Keywords

- "Find all"
- "Generate"
- "Permutations"
- "Combinations"
- "Subsets"
- "Recursion"
- "Backtrack"

## Example Interview Prompts

- "Generate all permutations of a string."
- "Solve the N-Queens problem."
- "Find all subsets of a set."
- "Solve Sudoku."

## How to Get the 'Click'

- If the problem asks for all possible solutions, think backtracking
- If constraints must be checked at each step, use backtracking
- If recursion and undoing choices are needed, backtracking applies

---

**Tip:** Practice backtracking on combinatorial and constraint problems to recognize these patterns quickly!


## README
# Backtracking

## Overview

Backtracking is a general algorithmic technique for solving problems recursively by trying to build a solution incrementally, removing solutions that fail to satisfy the constraints of the problem at any point in time.

## Real-life Use Cases

- Solving puzzles (Sudoku, N-Queens)
- Generating permutations and combinations
- Pathfinding in mazes
- Constraint satisfaction problems

## Interview Relevance

Backtracking is frequently asked in interviews for problems involving recursion, combinatorics, and constraint satisfaction.

---

## Files

- `Algorithm.md`: Step-by-step explanation and pseudocode
- `PatternRecognition.md`: How to spot backtracking problems
- `Examples.md`: Worked examples
- `TestCases.md`: Sample test cases
- `Solution.java`: Java implementation


## TestCases
# Backtracking Test Cases

## Test Case 1: N-Queens

Input: n = 4
Expected Output: 2 valid arrangements

## Test Case 2: Subsets

Input: nums = [1,2]
Expected Output: [[], [1], [2], [1,2]]

## Test Case 3: Permutations

Input: nums = [1,2]
Expected Output: [[1,2], [2,1]]



