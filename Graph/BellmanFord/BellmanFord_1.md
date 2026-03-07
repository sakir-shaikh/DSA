# BellmanFord

## Algorithm
# Bellman-Ford Algorithm

## Description

Bellman-Ford computes shortest paths from a single source to all vertices in a weighted graph (can handle negative weights).

## Pseudocode

```
function bellmanFord(graph, V, src):
    dist = [INF] * V
    dist[src] = 0
    for i = 1 to V-1:
        for each edge (u, v, w):
            if dist[u] + w < dist[v]:
                dist[v] = dist[u] + w
    for each edge (u, v, w):
        if dist[u] + w < dist[v]:
            report negative cycle
```

## Steps

1. Initialize distances from source to all vertices as infinite.
2. Relax all edges V-1 times.
3. Check for negative-weight cycles.


## Examples
# Bellman-Ford Examples

## Example 1

Input: Graph with edges [(0,1,5), (1,2,-2), (2,0,1)], V=3, src=0
Output: Shortest distances from 0: [0,5,3]

## Example 2

Input: Graph with edges [(0,1,1), (1,2,-1), (2,0,-1)], V=3, src=0
Output: Negative cycle detected


## PatternRecognition
# Pattern Recognition: When to Use Bellman-Ford

## How to Recognize Bellman-Ford Problems

- The graph has negative edge weights
- You need to detect negative cycles
- Dijkstra’s algorithm cannot be used (negative weights)

## Common Patterns

- **Single-source shortest path with negative weights**
- **Detecting negative cycles**

## Typical Question Keywords

- "Negative weights"
- "Shortest path"
- "Negative cycle"
- "Relaxation"

## Example Interview Prompts

- "Find shortest paths in a graph with negative weights."
- "Detect if a graph contains a negative cycle."

## How to Get the 'Click'

- If the graph has negative weights, think Bellman-Ford
- If you need to detect negative cycles, use Bellman-Ford

---

**Tip:** Practice Bellman-Ford on graphs with negative weights and cycle detection!


## README
# Bellman-Ford Algorithm

## Overview

Bellman-Ford is a single-source shortest path algorithm for graphs that may have negative edge weights. It can also detect negative cycles.

## Real-life Use Cases

- Network routing protocols
- Currency arbitrage detection
- Finding shortest paths in graphs with negative weights

## Interview Relevance

Bellman-Ford is important for problems involving shortest paths with negative weights and cycle detection.

---

## Files

- `Algorithm.md`: Step-by-step explanation and pseudocode
- `PatternRecognition.md`: How to spot Bellman-Ford problems
- `Examples.md`: Worked examples
- `TestCases.md`: Sample test cases
- `Solution.java`: Java implementation


## TestCases
# Bellman-Ford Test Cases

## Test Case 1

Input: Graph = [(0,1,4), (0,2,5), (1,2,-3)], V=3, src=0
Expected Output: [0,4,1]

## Test Case 2

Input: Graph = [(0,1,1), (1,2,-1), (2,0,-1)], V=3, src=0
Expected Output: Negative cycle detected



