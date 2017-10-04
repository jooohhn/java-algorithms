package com.jooohhn.java_interview_prep.leetcode.algorithms;

/**
 * #617 (Easy)
 *
 * <p>Given two binary trees and imagine that when you put one of them to cover the other, some
 * nodes of the two trees are overlapped while the others are not.
 *
 * <p>You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 * then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be
 * used as the node of new tree.
 *
 * <p>Solution: @Time: O(k) where k is the size of the largest binary tree @Space: O(lgm) where m is
 * the depth of the tree. O(m) worst case if tree skewed
 */
public class MergeTwoBinaryTrees {

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) {
      return null;
    }

    int val = t1 == null ? 0 : t1.val;
    val += t2 == null ? 0 : t2.val;

    TreeNode root = new TreeNode(val);
    root.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
    root.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
    return root;
  }

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}