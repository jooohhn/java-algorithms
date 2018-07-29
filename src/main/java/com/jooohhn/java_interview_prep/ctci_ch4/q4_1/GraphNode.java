package com.jooohhn.java_interview_prep.ctci_ch4.q4_1;

import java.util.ArrayList;

public class GraphNode {
  public ArrayList<GraphNode> adjacentNodes = new ArrayList<>();
  public boolean visited;
  public String label;

  public GraphNode(String label) {
    this.label = label;
  }

  public void addAdjacentNode(GraphNode node) {
    adjacentNodes.add(node);
  }

  public int getAdjacentCount() {
    return this.adjacentNodes.size();
  }

  public ArrayList<GraphNode> getAdjacentNodes() {
    return adjacentNodes;
  }

  public String getLabel() {
    return label;
  }
}
