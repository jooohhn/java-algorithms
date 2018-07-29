package com.jooohhn.java_interview_prep.datastructures;

import java.util.ArrayList;

public class Graph {
  public ArrayList<GraphNode> verticesCount = new ArrayList<>();

  public Graph() {
  }

  public void addNode(GraphNode node) {
    verticesCount.add(node);
  }

  public int getSize() {
    return this.verticesCount.size();
  }

  public ArrayList<GraphNode> getNodes() {
    return this.verticesCount;
  }
}
