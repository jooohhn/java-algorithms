package com.jooohhn.java_interview_prep.ctci_ch4.q4_3;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the
 * nodes at each level (e.g., if you have a tree with level 0, you'll have 0 linked lists).
 *
 * Solution: Utilize BFS and have a level counter
 */
public class Q4_3 {

  /**
   * Uses a BFS type algorithm that keeps track of what level a node is. If a List at that level
   * already exists, then add it to that List. If not, then create one and add it
   *
   * @Time: O(n)
   * @Space: O(n)
   */
  public static ArrayList<LinkedList<TreeNode>> getNodesAtEachDepth(TreeNode root) {
    ArrayList<LinkedList<TreeNode>> depths = new ArrayList<>();
    createNodesAtEachDepth(root, 0, depths);
    return depths;
  }

  private static void createNodesAtEachDepth(
      TreeNode node, int level, ArrayList<LinkedList<TreeNode>> depths) {
    if (node == null) return;

    // If level's LinkedList hasn't been created yet, create it and add the node.
    // Else, just add the node
    if (depths.size() <= level) {
      LinkedList<TreeNode> newList = new LinkedList<>();
      newList.add(node);
      depths.add(newList);
    } else {
      depths.get(level).add(node);
    }

    createNodesAtEachDepth(node.left, level + 1, depths);
    createNodesAtEachDepth(node.right, level + 1, depths);
  }

  public static void main(String[] args) {
    TreeNode node0 = new TreeNode(0);
    TreeNode node1 = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    TreeNode node6 = new TreeNode(6);

    node0.left = node1;
    node0.right = node2;
    node1.left = node3;
    node1.right = node4;
    node2.left = node5;
    node2.right = node6;

    ArrayList<LinkedList<TreeNode>> depths = getNodesAtEachDepth(node0);
    System.out.println(depths);
  }
}
