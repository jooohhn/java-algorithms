package com.jooohhn.java_interview_prep.ctci_ch4.q4_5;

/**
 * Validate BST: Implement a function to check if a binary tree is a binary search tree.
 *
 * Solution: Recall BST definition: For each node, leftChild <= node < rightChild
 * @1) For each node, have a min and max value that it can be
 * @2) Traverse the children of the node, resetting what min and max should be
 * @3) If a node violates the BST property, then return false
 */
public class Q4_5 {


   public static boolean checkBst(TreeNode root) {
     return checkBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
   }

   private static boolean checkBst(TreeNode node, int min, int max){
     if(node == null) return true;

     if(node.data < min || node.data > max){
       return false;
     }

     return checkBst(node.left, min, node.data) && checkBst(node.right, node.data, max);
   }

}
