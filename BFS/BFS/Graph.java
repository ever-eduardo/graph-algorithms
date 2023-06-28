package BFS;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final int V;
    private final List<List<Integer>> adjacencyList; // Adjacency List Representation.

    public Graph(int vertices) {
        V = vertices;
        adjacencyList = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public int getVerticesCount() {
        return V;
    }

    public List<List<Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    public void addEdge(int v, int w) {
        adjacencyList.get(v).add(w);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Graph Adjacency List:\n");
        result.append("[\n");
        for (List<Integer> vector: adjacencyList) {
            result.append("\t");
            result.append(vector.toString());
            result.append("\n");
        }
        result.append("]");
        return result.toString();
    }
}
