# graph-algorithms

A review of the most common graph algorithms.

### BFS
BFS is a graph traversal algorithm used to explore all the vertices of a graph in breadth-first order, starting from a specific source vertex. It explores all the vertices at the same level before moving to the next level. BFS uses a queue data structure to keep track of the vertices to be visited.

#### Algorithm steps
    Create a queue and enqueue the source vertex.
    Mark the source vertex as visited.
    While the queue is not empty, do the following:
        Dequeue a vertex from the queue.
        Process the vertex (e.g., print it or perform any desired operation).
        Enqueue all the adjacent vertices of the dequeued vertex that are not yet visited.
        Mark the adjacent vertices as visited.
