package leetcode.algorithms;

/**
 * #657 (Easy) Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge
 * if this robot makes a circle, which means it moves back to the original place.
 *
 * The move sequence is represented by a string. And each move is represent by a character. The
 * valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or
 * false representing whether the robot makes a circle.
 *
 * Solution: Uses an array to keep track of position
 *
 * @Time: O(n) Where n is moves length
 * @Space: O(1)
 */
public class JudgeRouteCircle {

  public static boolean judgeCircle(String moves) {
    int[] position = {0, 0};
    for (int i = 0; i < moves.length(); i++) {
      if (moves.charAt(i) == 'R') {
        position[1]++;
      } else if (moves.charAt(i) == 'L') {
        position[1]--;
      } else if (moves.charAt(i) == 'U') {
        position[0]++;
      } else if (moves.charAt(i) == 'D') {
        position[0]--;
      } else {
        throw new IllegalArgumentException("Invalid character " + moves.charAt(i) + "given");
      }
    }
    return position[0] == 0 && position[1] == 0;
  }
}
