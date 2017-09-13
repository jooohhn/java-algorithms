package helpers;

import java.util.Random;

public class HelperFunctions {

  public static int getRandomInteger() {
    return new Random().nextInt();
  }

  public static int getRandomIntegerRange(int lowest, int highest) {
    return new Random().nextInt(highest) + lowest;
  }

  public static int[] getRandomIntegerArray(int lowest, int highest, int length) {
    int[] arr = new int[length];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = getRandomIntegerRange(lowest, highest);
    }
    return arr;
  }

  public static <T> T[] getFilledArray(T[] arr, T val) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = val;
    }
    return arr;
  }

}
