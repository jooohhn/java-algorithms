package com.jooohhn.java_interview_prep.ctci_ch1;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are
 * set to O.
 *
 * Solution - 1)
 *
 * Solution: Iterate through each element in the matrix, marking in a table whether it has
 * already been zero'd or not.
 */
public class Q1_8 {

  /** Iterate through each element in the matrix Time: O(n^2) Space: O(1) */
  public static int[][] zeroMatrix(int[][] matrix) {
    // Below tables are used to log when certain rows have already been
    // zero'd
    boolean[] rowTable = new boolean[matrix.length];
    boolean[] colTable = new boolean[matrix[0].length];

    for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
      for (int colIndex = 0; colIndex < matrix[0].length; colIndex++) {
        if (matrix[rowIndex][colIndex] == 0 && !rowTable[rowIndex] && !colTable[colIndex]) {
          zeroRowAndColumn(matrix, rowIndex, colIndex);
          rowTable[rowIndex] = true;
          colTable[colIndex] = true;
        }
      }
    }
    return matrix;
  }

  /** Helper method to zero the rows and columns of a matrix */
  private static void zeroRowAndColumn(int[][] matrix, int rowIndex, int colIndex) {
    // Zero the row
    for (int i = 0; i < matrix[0].length; i++) {
      matrix[rowIndex][i] = 0;
    }
    // Zero the column
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][colIndex] = 0;
    }
  }
}
