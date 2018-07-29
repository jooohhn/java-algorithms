package com.jooohhn.java_interview_prep.ctci_ch4.q4_1;

import com.jooohhn.java_interview_prep.datastructures.Queue;

/**
 * Given a directed graph, design an algorithm to find out whether there is a route between two
 * nodes.
 *
 * Solution: Utilize BFS to see if there is a route.
 */
public class Q4_1 {

  /**
   *
   * @Time: O(k^b) where each node has at most k neighbors and d is the longest path
   *        OR O(|V| + |E|) because each vertex and edge will be visited once
   * @Space: O(|V|) where V is the set of vertices
   */
  public static boolean existsRoute(Graph g, GraphNode a, GraphNode b) {
    // Run depth first search to see if there exists such a graph
    for (GraphNode n : g.vertices) {
      n.visited = false;
    }

    Queue<GraphNode> toVisit = new Queue<>();
    toVisit.add(a);

    while (!toVisit.isEmpty()) {
      GraphNode visiting = toVisit.remove();
      visiting.visited = true;
      for (GraphNode n : visiting.adjacentNodes) {
        if (n == b) return true;

        if(!n.visited) {
          toVisit.add(n);
        }
      }
    }
    return false;
  }
}
