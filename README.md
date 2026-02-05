# Graphs-Java
Graph Data Structure used in Modeling network.

Graph DS has Vertices(Nodes) + Edges(connections).

Graph can be Directed, UnDirected, Weighted & UnWeighted.

---

### Many ways to traverse a graphs, Important one are:
#### 1. Depth-First Search (DFS)
#### 2. Breadth-First Search (BFS)
#### 3. Dijkstra's Algorithm

---

### 1. Depth-First Search

##### Depth-First Search follows every possible path to its conclusion.

### 2. Breadth-First Search (BFS)

##### Breadth-First Search expand the search from point of origin to an ever expanding circle of neighboring vertices.

### 3. Dijkstra's Algorithm

##### Depth First Search follows every possible path to its conclusion.

###### Note: to track vertices/nodes we visited, we add a list. This list will be crucial because it prevents a search from returning to the same vertex multiple times. Important for Cyclical graph to avoid Infinite loop.

###### Runtime: In an upper bound scenario, we'll examine every vertex and node.
    for DFS & BFS: O(vertices + edges)

----

### 3 Main traversal order of graphs:
#### 1. Pre-Order 
    In which each vertex is added to the visited list, and added to the output list before getting added to the stack.
#### 2. Post-Order
    In which each vertex is added to the visited list and added to the output list after it is popped off the stack.

#### 3. Reverse Post-Order (Topological Sort)
    Which returns the output list that is exactly the reverse of the post order list. 