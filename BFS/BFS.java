
import java.util.*;

public class BFS {
    private final List<Boolean> visited;
    private final Queue<Integer> queue;
    private final Graph graph;

    public BFS(Graph graph) {
        queue = new ArrayDeque<>();
        visited = new ArrayList<>(graph.getVerticesCount());
        for (int i = 0; i < graph.getVerticesCount(); i++) {
            visited.add(false);
        }
        this.graph = graph;
    }

    public void performSearch(int sourceVertex) {
        visited.set(sourceVertex, true);
        queue.offer(sourceVertex);
        while (!queue.isEmpty()) {
            sourceVertex = queue.poll();
            System.out.println("Processing vertex " + sourceVertex);
            for (int node : graph.getAdjacencyList().get(sourceVertex)) {
                if (!visited.get(node)) {
                    visited.set(node, true);
                    queue.offer(node);
                }
            }
        }
    }
}
