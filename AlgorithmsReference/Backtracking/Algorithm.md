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
