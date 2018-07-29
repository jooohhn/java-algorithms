package com.jooohhn.java_interview_prep.ctci_ch4.q4_4;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
 * this question, a balanced tree is defined to be a tree such that the heights of the two subtrees
 * of any node never differ by more than one.
 *
 * @1 Traverse each node and calculate's each node's level and height number
 * @2 Create hash table associating level and heights @3 If two nodes with the same level have
 * heights differ by more than one, return false
 */
public class Q4_4 {

  /**
   * @Time: O(n) @Space: O(n)
   */
  public static boolean checkBalanced(TreeNode root) {
    // Tracks level: LinkedList containing integers of level:heights
    HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
    helper(root, 0, map);
    for (LinkedList<Integer> list : map.values()) {
      int completeHeight = list.peekFirst();
      for (int height : list) {
        if (Math.abs(completeHeight - height) > 1) {
          return false;
        }
      }
    }
    return true;
  }

  // Returns node height
  private static int helper(TreeNode root, int level, HashMap<Integer, LinkedList<Integer>> map) {
    if (root == null) {
      return -1;
    }

    int height =
        Math.max(helper(root.left, level + 1, map), helper(root.right, level + 1, map)) + 1;

    // Adds the current node to the level:heights map
    if (!map.containsKey(level)) {
      LinkedList<Integer> heights = new LinkedList<>();
      heights.add(height);
      map.put(level, heights);
    } else {
      map.get(level).add(height);
    }

    return height;
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
    System.out.println(checkBalanced(node0) == true);

    node3.left = node5;
    System.out.println(checkBalanced(node0) == false);
  }
}
