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
