package ctci_ch1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Q1_8Test {

  private int[][] randomMatrix(int M, int N, int min, int max) {
    int[][] matrix = new int[M][N];
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        matrix[i][j] = randomIntInRange(min, max);
      }
    }
    return matrix;
  }

  private int randomInt(int n) {
    return (int) (Math.random() * n);
  }

  private int randomIntInRange(int min, int max) {
    return randomInt(max + 1 - min) + min;
  }

  @Test
  public void zeroMatrix() throws Exception {
    int[][] matrix = {
        {1, 5, 3, 4, 8, 8, 7, 4, 5},
        {1, 5, 3, 4, 0, 8, 7, 4, 5},
        {1, 5, 3, 4, 8, 8, 7, 4, 5},
        {1, 5, 3, 4, 8, 8, 7, 4, 0},
        {1, 5, 0, 4, 8, 8, 7, 4, 5},
    };

    int[][] expected = {
        {1, 5, 0, 4, 0, 8, 7, 4, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {1, 5, 0, 4, 0, 8, 7, 4, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    Q1_8.zeroMatrix(matrix);

    for (int i = 0; i < matrix.length; i++) {
      assertArrayEquals(expected[i], matrix[i]);
    }
  }
}