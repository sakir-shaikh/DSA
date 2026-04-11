import java.util.*;

public class Solution {
    static class Edge {
        int u, v, w;
        Edge(int u, int v, int w) { this.u = u; this.v = v; this.w = w; }
    }
    public static void bellmanFord(List<Edge> edges, int V, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 1; i < V; i++) {
            for (Edge e : edges) {
                if (dist[e.u] != Integer.MAX_VALUE && dist[e.u] + e.w < dist[e.v]) {
                    dist[e.v] = dist[e.u] + e.w;
                }
            }
        }
        // Check for negative cycles
        for (Edge e : edges) {
            if (dist[e.u] != Integer.MAX_VALUE && dist[e.u] + e.w < dist[e.v]) {
                System.out.println("Negative cycle detected");
                return;
            }
        }
        System.out.println("Distances: " + Arrays.toString(dist));
    }
    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
            new Edge(0,1,4), new Edge(0,2,5), new Edge(1,2,-3)
        );
        bellmanFord(edges, 3, 0); // Output: Distances: [0, 4, 1]
    }
}
