package com.jooohhn.java_interview_prep.ctci_ch8;

import java.util.LinkedList;

/**
 * Imagine a robot sitting on the upper left corner of grid with r rows and c columns. The robot can
 * only move in two directions, right and down, but certain cells are "off limits" such that the
 * robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
 * the bottom right.
 *
 * <p>Solution 1) Do a depth first search-esque algorithm where each cell in the grid is explored
 * recursively, ignoring invalid gridpoints 2) For each valid neighboring cell connected to the
 * current cell, push that position onto the stack and test the new neighbor 3) If a cell has no
 * valid possible path, mark that cell as false
 */
public class Q8_2 {

  /**
   * @param grid Grid where true is an ok point, false is not
   * @return list of points that the robot visited
   */
  public static LinkedList<int[]> robotInAGrid(boolean[][] grid) {
    LinkedList<int[]> path = new LinkedList<>();
    path.push(new int[] {0, 0});
    robotInAGrid(grid, path, 0, 0);
    if (path.peek()[0] != grid[grid.length - 1].length - 1 && path.peek()[1] != grid.length - 1) {
      throw new RuntimeException("No valid path");
    }
    return path;
  }

  // If memo[r][c] == false, then path is bad
  private static LinkedList<int[]> robotInAGrid(
      boolean[][] grid, LinkedList<int[]> path, int r, int c) {
    // Reached the end
    if (r == grid.length - 1 && c == grid[grid.length - 1].length - 1) {
      return path;
    }

    // Checks current state
    boolean isValidPosition = false;
    if (c != grid[r].length - 1 && grid[r][c + 1]) {
      isValidPosition = true;
      path.push(new int[] {c + 1, r});
      robotInAGrid(grid, path, r, c + 1);
    }

    if (r != grid.length - 1 && c <= grid[r + 1].length - 1 && grid[r + 1][c]) {
      isValidPosition = true;
      path.push(new int[] {c, r + 1});
      robotInAGrid(grid, path, r + 1, c);
    }

    // If current path does not fit any recognized path
    if (!isValidPosition) {
      grid[r][c] = false;
      path.pop();
    }
    return path;
  }
}
