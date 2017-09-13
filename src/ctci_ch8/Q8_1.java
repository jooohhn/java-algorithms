package ctci_ch8;

/**
 * Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps,
 * or 3 steps at a time. Implement a method to count how many possible ways the child can run up the
 * stairs.
 *
 * Solution: Similar to fibbonaci dynamic programming, have a table that stores already calculated
 * results
 *
 * @Time: O(n)
 * @Space: O(n)
 */
public class Q8_1 {

  public static int tripleStep(int stairSteps) {
    int[] table = new int[stairSteps + 1];
    return helper(stairSteps, table);
  }

  private static int helper(int stairSteps, int[] table) {
    if (stairSteps == 0) {
      return 0;
    }
    if (stairSteps == 1) {
      return 1;
    }
    if (stairSteps == 2) {
      return 2;
    }
    if (stairSteps == 3) {
      return 4;
    }
    table[stairSteps] = helper(stairSteps - 1, table) + helper(stairSteps - 2, table)
        + helper(stairSteps - 3, table);
    return table[stairSteps];

  }
}
