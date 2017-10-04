package com.jooohhn.java_interview_prep.ctci_ch4;

/**
 * Validate BST: Implement a function to check if a binary tree is a binary search tree.
 *
 * <p>Solution: Recall BST definition: For each node, leftChild <= node < rightChild
 */
public class Q4_5 {

  /*
   * boolean checkBst(Node root) { // BST integrity holds if a node's doesn't have children if (root
   * = null) return true; \ if (root.left != null && root.left > root) return false; if (root.right
   * != null && root.right <= root) return false return checkBst(root.left) && checkBst(root.right)
   * }
   */
}
