package com.jooohhn.java_interview_prep.ctci_ch4.q4_2;

/**
 * Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an
 * algorithm to create a binary search tree with minimal height.
 *
 * Solution 1: Can iteratively add elements to a BST. However, it will be O(nlgn) Solution 2: Use
 * the nature of the array to advantage. Have the middle as the root, then recursively create BST
 * using the middle of both halves. Guarantees that there aren't unnecessary node movements
 */
public class Q4_2 {

  /**
   * Recursively creates binary trees of minimal heights by having the middle of each sub array
   * be the root of its subtree
   *
   * @Time: O(n)
   * @Space: O(n)
   *
   */
  public static TreeNode getMinimalBst(int[] arr) {
    return getMinimalBst(arr, 0, arr.length - 1);
  }

  public static TreeNode getMinimalBst(int[] arr, int first, int last) {
    if (last < first) return null;

    int middle = (first + last) / 2;
    TreeNode root = new TreeNode(arr[middle]);

    root.left = getMinimalBst(arr, first, middle - 1);
    root.right = getMinimalBst(arr, middle + 1, last);

    return root;
  }

  public static void printOrder(TreeNode root) {
    if (root != null) {
      printOrder(root.left);
      System.out.println(root.data);
      printOrder(root.right);
    }
  }

  public static void main(String[] args) {
    TreeNode root = getMinimalBst(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    printOrder(root);
  }
}
