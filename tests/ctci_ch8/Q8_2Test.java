package ctci_ch8;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import org.junit.Test;

public class Q8_2Test {

  @Test
  public void robotInAGrid() throws Exception {
    boolean[][] grid =
        {
            {true, true, false, false},
            {false, true, true},
            {false, true},
            {true, true, true, false},
            {false, false, true, true},
            {false, false, false, true},
            {false, true, false, true},
        };

    LinkedList<int[]> path = Q8_2.robotInAGrid(grid);

    assertEquals(6, path.peek()[1]);
    assertEquals(3, path.peek()[0]);

    for (int[] cord : path) {
      assertEquals(true, grid[cord[1]][cord[0]]);
    }
  }

}