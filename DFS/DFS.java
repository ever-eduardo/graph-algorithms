package DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    private final List<Boolean> visited;
    private final Stack<Integer> stack;
    private final Graph graph;

    public DFS(Graph graph) {
        this.graph = graph;
        visited = new ArrayList<>(graph.getVerticesCount());
        for (int i = 0; i < graph.getVerticesCount(); i++) {
            visited.add(false);
        }
        stack = new Stack<>();
    }

    public List<Integer> performSearch(int sourceVertex) {
        List<Integer> result = new ArrayList<>();
        stack.push(sourceVertex);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.get(node)) {
                visited.set(node, true);
                result.add(node);
                for (int neighbour: graph.getAdjacencyList().get(node)) {
                    stack.push(neighbour);
                }
            }
        }
        return result;
    }
}
