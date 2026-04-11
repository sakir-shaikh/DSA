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
