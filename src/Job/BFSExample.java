package Job;

import java.util.*;

public class BFSExample {
    // Method to perform BFS
    public static void bfs(Map<String, List<String>> graph, String start) {
        Set<String> visited = new HashSet<>();            // Track visited nodes
        Queue<String> queue = new LinkedList<>();         // Queue for BFS

        queue.add(start);                                 // Enqueue start node

        while (!queue.isEmpty()) {
            String vertex = queue.poll();                 // Dequeue
            if (!visited.contains(vertex)) {
                System.out.print(vertex + " ");           // Process node
                visited.add(vertex);                      // Mark as visited

                for (String neighbor : graph.get(vertex)) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);              // Enqueue neighbors
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create graph as an adjacency list
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "F"));
        graph.put("D", Arrays.asList("B"));
        graph.put("E", Arrays.asList("B", "F"));
        graph.put("F", Arrays.asList("C", "E"));

      /*  graph.forEach((s, strings) -> {
            System.out.print("The Key is "+s + " the adjacent values {");
            strings.forEach(System.out::print);
            System.out.println("}");
        });*/

        // Perform BFS starting from node "A"
        bfs(graph, "A");  // Output: A B C D E F
    }
}

