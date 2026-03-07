# BFS

## Algorithm
# BFS Algorithm

## Description

BFS explores all neighbors at the current depth before moving to the next level. It uses a queue to keep track of nodes to visit.

## Pseudocode

```
function BFS(graph, start):
    create a queue Q
    mark start as visited
    Q.enqueue(start)
    while Q is not empty:
        node = Q.dequeue()
        process(node)
        for each neighbor of node:
            if neighbor not visited:
                mark neighbor as visited
                Q.enqueue(neighbor)
```

## Steps

1. Initialize a queue and mark the start node as visited.
2. While the queue is not empty:
   - Dequeue a node and process it.
   - Enqueue all unvisited neighbors.


## Examples
# BFS Examples

## Example 1: Shortest Path in Unweighted Graph

Input: Graph = {0: [1,2], 1: [0,3], 2: [0,3], 3: [1,2]}, start = 0
Output: [0, 1, 2, 3]
Explanation: BFS visits nodes in order of increasing distance from start.

## Example 2: Level Order Traversal of Binary Tree

Input: Tree = [1,2,3,null,4]
Output: [[1], [2,3], [4]]
Explanation: BFS visits nodes level by level.


## PatternRecognition
# Pattern Recognition: When to Use BFS

## How to Recognize BFS Problems

- The problem involves finding the shortest path in an unweighted graph
- You need to explore all nodes level by level
- The problem is about connectivity or reachability
- The input is a graph, tree, or grid

## Common Patterns

- **Shortest path in unweighted graph**
- **Level order traversal of a tree**
- **Flood fill in a grid**
- **Finding connected components**

## Typical Question Keywords

- "Shortest path"
- "Level order"
- "Breadth-first"
- "Unweighted graph"
- "Connectivity"

## Example Interview Prompts

- "Find the shortest path between two nodes in an unweighted graph."
- "Perform level order traversal of a binary tree."
- "Flood fill a grid."

## How to Get the 'Click'

- If the problem asks for shortest path in an unweighted graph, think BFS
- If you need to process nodes level by level, use BFS
- If the problem involves reachability or connectivity, BFS may apply

---

**Tip:** Practice BFS on graphs, trees, and grids to recognize these patterns quickly!


## README
# Breadth-First Search (BFS)

## Overview

BFS is a fundamental graph traversal algorithm that explores nodes level by level. It is used in shortest path problems, connectivity, and many interview questions.

## Real-life Use Cases

- Finding shortest path in unweighted graphs
- Web crawling
- Social network analysis
- Network broadcasting

## Interview Relevance

BFS is frequently asked in interviews for problems involving graphs, trees, and grids.

---

## Files

- `Algorithm.md`: Step-by-step explanation and pseudocode
- `PatternRecognition.md`: How to spot BFS problems
- `Examples.md`: Worked examples
- `TestCases.md`: Sample test cases
- `Solution.java`: Java implementation


## TestCases
# BFS Test Cases

## Test Case 1

Input: Graph = {0: [1], 1: [0,2], 2: [1]}, start = 0
Expected Output: [0, 1, 2]

## Test Case 2

Input: Tree = [1,2,3,4,5]
Expected Output: [[1], [2,3], [4,5]]



