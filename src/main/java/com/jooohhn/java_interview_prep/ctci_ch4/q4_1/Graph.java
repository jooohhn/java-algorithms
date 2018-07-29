package com.jooohhn.java_interview_prep.ctci_ch4.q4_1;

import java.util.ArrayList;

public class Graph {
  public ArrayList<GraphNode> vertices = new ArrayList<>();

  public Graph() {
  }

  public void addNode(GraphNode node) {
    vertices.add(node);
  }

  public int getSize() {
    return this.vertices.size();
  }

  public ArrayList<GraphNode> getNodes() {
    return this.vertices;
  }
}
