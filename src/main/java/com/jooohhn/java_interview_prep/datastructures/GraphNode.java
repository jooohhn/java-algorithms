package com.jooohhn.java_interview_prep.datastructures;

import java.util.ArrayList;

public class GraphNode {
  public ArrayList<GraphNode> adjacentNodes = new ArrayList<>();
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
