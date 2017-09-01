package helpers;

import java.util.Random;

public class HelperFunctions {

  public static int getRandomInteger() {
    return new Random().nextInt();
  }

  public static int getRandomIntegerRange(int lowest, int highest) {
    return new Random().nextInt(highest) + lowest;
  }

}
