# graph-algorithms

A review of the most common graph algorithms. Take each folder of the source code as a self-contained package with no external dependencies other thant the Java Core libraries.

## BFS
BFS is a graph traversal algorithm used to explore all the vertices of a graph in breadth-first order, starting from a specific source vertex. It explores all the vertices at the same level before moving to the next level. BFS uses a queue data structure to keep track of the vertices to be visited.

### Algorithm
    Create a queue and enqueue the source vertex.
    Mark the source vertex as visited.
    While the queue is not empty, do the following:
        Dequeue a vertex from the queue.
        Process the vertex (e.g., print it or perform any desired operation).
        Enqueue all the adjacent vertices of the dequeued vertex that are not yet visited.
        Mark the adjacent vertices as visited.

## DFS
DFS is a graph traversal algorithm used to explore all the vertices of a graph in depth-first order. It starts at a specific source vertex and explores as far as possible along each branch before backtracking. DFS can be implemented using recursion or an explicit stack.

### Algorithm
    Create a stack and push the source vertex.
    While the stack is not empty, do the following:
        Pop a vertex from the stack.
        if the popped vertex has not been visited, then do the following:
            Mark the current vertex as visited.
            Process the current vertex (e.g., print it or perform any desired operation).
            For each unvisited neighbor of the current vertex, push it into the stack.
